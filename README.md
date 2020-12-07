### PACT  - Example Provider application

Simple application serving up a "get biscuits by id" api, to demonstrate the Provider side of pact contract testing


### Prerequisites

* jvm 11+ (recommend installing via [sdkman](https://sdkman.io/))

### Run the tests

    ./gradlew clean build 

Expects to find a pact broker at http://localhost:2020

To additionally publish results to the broker, add `-Dpact.verifier.publishResults=true` to the gradle command 

