/*

 MIT License

 Copyright (c) 2021 Looker Data Sciences, Inc.

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.

 */

export interface Resource {
  content: string
  type: string
  tag: string
  link: string
  shortenedLink: string
  title: string
}

export const resources: Array<Resource> = [
  {
    content: 'The API Explorer lets you learn and interact with Looker API.',
    type: 'Resource',
    tag: 'api',
    link: 'https://hack.looker.com/extensions/marketplace_git_github_com_looker_open_source_extension_api_explorer_git::api-explorer',
    shortenedLink: 'https://bit.ly/3j1sdWD',
    title: 'API Explorer',
  },
  {
    content: 'Gzr is a Looker Content Utility developer tool',
    type: 'Example',
    tag: 'devtool',
    link: 'https://github.com/looker-open-source/gzr',
    shortenedLink: 'https://bit.ly/3mSyZiu',
    title: 'Gzr',
  },
  {
    content:
      'The SDK Codegen is the source of truth for all SDKs and lets you create them for any language',
    type: 'Resource',
    tag: 'api',
    link: 'https://github.com/looker-open-source/sdk-codegen',
    shortenedLink: 'https://bit.ly/3lIk23g',
    title: 'SDK Codegen',
  },
  {
    content:
      'Our collection of SDK examples currently in: C#, Java, Kotlin, Python, R, Ruby, Swift, and TypeScript.',
    type: 'Resource',
    tag: 'api',
    link: 'https://github.com/looker-open-source/sdk-codegen/tree/main/examples',
    shortenedLink: 'https://bit.ly/3AL4VdI',
    title: 'SDK Examples',
  },
  {
    content:
      "Look At Me Sideways (LAMS) is a style guide and linter for LookML. It is designed to help a team of developers to produce more maintainable LookML projects.",
    type: 'Example',
    tag: 'devtool',
    link: 'https://github.com/looker-open-source/look-at-me-sideways',
    shortenedLink: 'https://bit.ly/3DOrMGS',
    title: 'LookML Style Guide & Linter',
  },
  {
    content:
      'Looker Components are a collection of tools for building Looker data experiences.',
    type: 'Resource',
    tag: 'other',
    link: 'https://components.looker.com/',
    shortenedLink: 'https://bit.ly/3DOrMGS',
    title: 'Looker Components',
  },
  {
    content:
      'Looker Components Storybook contains component examples',
    type: 'Resource',
    tag: 'other',
    link: 'https://components.looker.com/storybook',
    shortenedLink: 'https://bit.ly/3pbpygP',
    title: 'Components Examples Storybook',
  },
  {
    content:
      'The Looker JavaScript Embed SDK makes embedding Looker content in your web application easy!',
    type: 'Resource',
    tag: 'embed',
    link: 'https://github.com/looker-open-source/embed-sdk',
    shortenedLink: 'https://bit.ly/3n2mDEJ',
    title: 'Embed SDK',
  },
  {
    content:
      'Henry is a command line tool that finds model bloat in your Looker instance and identifies unused content in models and explores.',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/looker-open-source/henry',
    shortenedLink: 'https://bit.ly/3j1NShp',
    title: 'Henry',
  },
  {
    content:
      "A repository with multiple Extension Framework examples using Typescript, Javascript, React, and Redux",
    type: 'example',
    tag: 'extension',
    link: 'https://github.com/looker-open-source/extension-examples',
    shortenedLink: 'https://bit.ly/2YYdlkM',
    title: 'Extension Framework Examples',
  },
  {
    content:
      `The Kitchensink Extension Framework example demonstrates most of Extension SDK's functionality and is a great starting point.`,
    type: 'example',
    tag: 'extension',
    link: 'https://github.com/looker-open-source/extension-examples/tree/main/react/typescript/kitchensink',
    shortenedLink: 'https://bit.ly/3n1zbMk',
    title: 'Main Extension Framework Example',
  },
  {
    content:
      'The React Extension SDK npm package. This lets you build a Looker extension — See the Extension Framework Examples for examples.',
    type: 'resource',
    tag: 'extension',
    link: 'https://www.npmjs.com/package/@looker/extension-sdk-react',
    shortenedLink: 'https://bit.ly/3pbzoPN',
    title: 'Extension SDK: React',
  },
  {
    content:
      'Chatty is a simple web browser iframe host/client channel message manager. We use it for iframe communication.',
    type: 'resources',
    tag: 'embed',
    link: 'https://github.com/looker-open-source/chatty',
    shortenedLink: 'https://bit.ly/2Z2NrfP',
    title: 'Chatty - Iframe Msg Manager',
  },
  {
    content:
      'A Snowflake based LookML that demonstrates Looker’s value in the digital marketing landscape.',
    type: 'example',
    tag: 'lookml',
    link: 'https://github.com/looker-open-source/marketing_demo',
    shortenedLink: 'https://bit.ly/2YR9rKN',
    title: 'Digital Marketing Demo',
  },
  {
    content:
      'A BigQuery based LookML that demonstrates Looker’s value in the healthcare landscape.',
    type: 'example',
    tag: 'lookml',
    link: 'https://github.com/looker-open-source/healthcare_demo',
    shortenedLink: 'https://bit.ly/3FUokfN',
    title: 'Healthcare Demo',
  },
  {
    content:
      'This is the official Looker Data Dictionary, fully open source and available as an example.',
    type: 'example',
    tag: 'extension',
    link: 'https://github.com/looker-open-source/app-data-dictionary',
    shortenedLink: 'https://bit.ly/3vhMlZh',
    title: 'Data Dictionary Extension',
  },
  {
    content:
      'Thinking of doing a data analysis project for your hack? Browse and explore BigQuery public datasets through the hackathon instance',
    type: 'resources',
    tag: 'other',
    link: 'https://hack.looker.com/dashboards/16',
    title: 'Public Datasets',
  },
  {
    content:
      'This COVID-19 Block consists of LookML models, pre-built dashboards, and explores. The underlying data is only available in BigQuery.',
    type: 'example',
    tag: 'lookml',
    link: 'https://github.com/looker/covid19/blob/master/readme.md',
    title: 'COVID-19 Data Block',
  },
  {
    content:
      'Prebuilt dashboards for immediate access to COVID-19 data.',
    type: 'resource',
    tag: 'lookml',
    link: 'https://covid19response.cloud.looker.com/embed/dashboards-next/51',
    title: 'COVID-19 Dashboards',
  },
  {
    content:
      'This repository demonstrates how to write a Looker extension that needs an access key to run.',
    type: 'example',
    tag: 'extension',
    link: 'https://github.com/looker-open-source/extension-access-key-demo',
    title: 'Extension Template: Access Key',
  },
  {
    content: 'An early-stage mockup of a Twitter-style Looker Extension.',
    type: 'example',
    tag: 'extension',
    link: 'https://github.com/bryan-at-looker/looker-feed',
    title: 'Looker Feed',
  },
  {
    content:
      'The official Looker Action Hub repository for all your action requirements and examples.',
    type: 'example',
    tag: 'action',
    link: 'https://github.com/looker/actions',
    title: 'Action Hub',
  },
  {
    content:
      'Direct link to the directory with all the complete Actions in the official action hub.',
    type: 'example',
    tag: 'action',
    link: 'https://github.com/looker/actions/tree/master/src/actions',
    title: 'Actions Examples',
  },
  {
    content:
      'Simple Mock ActionHub for local or serverless (GCF) use. Super useful as a starter.',
    type: 'example',
    tag: 'action',
    link: 'https://github.com/fabio-looker/sample-cloud-function-action',
    title: 'Cloud Function Action Template',
  },
  {
    content:
      'Write an action that exports the Results of a Looker Query to BigQuery',
    type: 'tutorial',
    tag: 'action',
    link: 'https://discourse.looker.com/t/export-the-results-of-a-looker-query-to-bigquery/9720',
    title: 'Bigquery writeback action',
  },
  {
    content:
      'The official API and examples repo for Looker Custom Visualizations',
    type: 'example',
    tag: 'viz',
    link: 'https://github.com/looker/custom_visualizations_v2',
    title: 'Looker Custom Viz v2',
  },
  {
    content:
      'Direct link to the examples repo for Looker Custom Visualizations',
    type: 'example',
    tag: 'viz',
    link: 'https://github.com/looker/custom_visualizations_v2/tree/master/src/examples',
    title: 'Custom Viz Examples',
  },
  {
    content: 'Web IDE to help developer Looker custom visualizations',
    type: 'resource',
    tag: 'viz',
    link: 'https://lookervisbuilder.com/',
    title: 'Looker Vis Builder',
  },
  {
    content:
      'Very thorough tutorial to build a custom viz development environment',
    type: 'tutorial',
    tag: 'viz',
    link: 'https://discourse.looker.com/t/creating-a-development-environment-for-custom-visualizations/8470',
    title: 'Creating a Development Environment for Custom Visualizations',
  },
  {
    content:
      'An example custom viz development environment, developed by Headset',
    type: 'example',
    tag: 'viz',
    link: 'https://github.com/Headset/looker-environment',
    title: 'Viz development environment example',
  },
  {
    content: 'An older demo of Lookers custom viz capabilities',
    type: 'resource',
    tag: 'viz',
    link: 'https://youtu.be/ixwWGKyG3wA',
    title: 'Custom Viz Demo Video',
  },
  {
    content:
      'This Google Apps Script uses Looker API to load Looks, get data dictionaries, etc.',
    type: 'example',
    tag: 'api',
    link: 'https://github.com/brechtv/looker_google_sheets',
    title: 'Looker API for Google Sheets',
  },
  {
    content:
      'This is by far the best way to troubleshoot SSO embed URLs generated by your scripts',
    type: 'resource',
    tag: 'embed',
    link: 'https://fabio-looker.github.io/looker_sso_tool/',
    title: 'SSO Embed Tool',
  },
  {
    content:
      'If you want to make your own or improve it: This is the code for the best way to troubleshoot SSO embed URLs generated by your scripts',
    type: 'example',
    tag: 'embed',
    link: 'https://github.com/fabio-looker/looker_sso_tool',
    title: 'SSO Embed Tool source code',
  },
  {
    content: 'An awesome example of an ever-useful LookML Style Guide',
    type: 'example',
    tag: 'lookml',
    link: 'https://github.com/mattm/lookml-style-guide',
    title: 'Matts LookML Style Guide',
  },
  {
    content: 'vim syntax for LookML',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/thalesmello/lkml.vim',
    title: 'lkml.vim',
  },
  {
    content: 'VSCode syntax for LookML',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/Ladvien/vscode-looker',
    title: 'VSCode Looker',
  },
  {
    content:
      'Automated EAV builder for... EAV schemas! Turn this into an extension!',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/fabio-looker/eav-builder',
    title: 'EAV Builder',
  },
  {
    content:
      'Basic instructions on how to deploy an AWS Lambda function and set up your Looker instance to poll an initiate changes to your LookML model through the Lambda function.',
    type: 'tutorial',
    tag: 'devtool',
    link: 'https://discourse.looker.com/t/automating-frequently-changing-schemas-with-aws-lambda/10196',
    title: 'Automating schemas w/ Lambda',
  },
  {
    content:
      'Developed by WW, This repository contains some tools to handle best practices of a set of developers working on LookML files.',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/ww-tech/lookml-tools',
    title: 'LookML Tools',
  },
  {
    content:
      'This script was designed for Looker users who have columns in their data tables with JSON objects. It creates a LookML view file that generates a dimension for each field within a JSON object, and pushes that file into github.',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/leighajarett/JSON_to_LookML',
    title: 'JSON 2 LookML',
  },
  {
    content:
      'A tool to persist descriptions from your dbt project your lookml project.',
    type: 'example',
    tag: 'devtool',
    link: 'https://github.com/fishtown-analytics/dbtdocs-to-lookml',
    title: 'DBTdocs 2 LookML',
  },
  {
    content:
      'A speedy LookML parser and serializer implemented in pure Python.',
    type: 'resource',
    tag: 'devtool',
    link: 'https://github.com/joshtemple/lkml',
    title: 'lkml parser',
  },
  {
    content: "A comprehensive demo of Looker's embedding capabilities",
    type: 'example',
    tag: 'embed',
    link: 'https://atomfashion.io/',
    title: 'Atom Fashion Embed Demo',
  },
  {
    content: 'An awesome list of awesome Looker projects.',
    type: 'resource',
    tag: 'other',
    link: 'https://github.com/alison985/awesome-looker',
    title: 'Awesome Looker List',
  },
  {
    content: "Looker 3.0 SDK for R",
    type: 'Example',
    tag: 'api',
    link: 'https://github.com/looker-open-source/lookr',
    shortenedLink: 'https://bit.ly/3vfJwIr',
    title: 'Looker R SDK 3.0',
  },
]
