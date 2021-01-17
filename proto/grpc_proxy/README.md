# Looker GRPC Proxy Server

GRPC proxy server to a Looker instance.
1. Listens for GRPC requests.
2. Converts GRPC request to Looker JSON.
3. Calls Looker JSON rest endpoint.
4. Converts rest response to GRPC response.
5. Returns GRPC response.

## Setup

Install protobuf generator, `protoc`.
`brew install protobuf`

File formatter.
`brew install clang-format`

### SSL setup for local testing

Run `scripts/ssl_setup.sh`

### Generate protobuf definitions and java implementation (TODO)

Run `scripts/gen_protobuf.sh`

## Notes

### Protobuf identifier generation

Not convinced about the implementation that generates protobuf identifiers but
it will do for now. Originally it used the index of the property in javascript
object but this is a little brittle as there is no guarantee a developer will
not insert a new property into the object. This generates a consistent value
across runs. The problem is that the identifier MUST be between 0 and 536870911.
To fix this negative values are multipled by -1 and values greater than
536870911 are bitwise shifted right until they are less than or equal to
536870911. So far their have been  no collisions but I suspect there are better
implementations.


