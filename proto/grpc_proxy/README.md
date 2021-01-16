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

