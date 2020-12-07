### PACT  - Example Provider verification tests

Provider verification of pact consumer contract tests, for the [biscuits](https://github.com/csbiggar/biscuits) service.

Part of the  [workshop steps here](https://github.com/csbiggar/pact-contract-testing-workshop)

### Prerequisites

* jvm 11+ (recommend installing via [sdkman](https://sdkman.io/))
* a pact broker (get a quick locally running broker set up by following [these instructions](https://github.com/pact-foundation/pact-broker-docker/blob/master/POSTGRESQL.md#running-postgresql-via-docker) )

### Run the tests & publish results to broker

    ./gradlew clean build -Dpact.verifier.publishResults=true

Expects to find a pact broker at http://localhost:2020
