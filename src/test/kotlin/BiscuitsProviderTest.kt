import au.com.dius.pact.provider.junit.Provider
import au.com.dius.pact.provider.junit.State
import au.com.dius.pact.provider.junit.loader.PactBroker
import au.com.dius.pact.provider.junit5.HttpTestTarget
import au.com.dius.pact.provider.junit5.PactVerificationContext
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestTemplate
import org.junit.jupiter.api.extension.ExtendWith

@Provider("biscuits")
@PactBroker(
    host = "localhost:2020",
    scheme = "http",
    port = "80"
)
class BiscuitsProviderTest {

    @BeforeEach
    fun before(context: PactVerificationContext) {
        val biscuitsApiBase = "localhost:9000"
        context.target = HttpTestTarget(biscuitsApiBase, 8080, "/")
    }

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider::class)
    internal fun pactVerificationTestTemplate(context: PactVerificationContext) {
        context.verifyInteraction()
    }

    @State("sku 1 does not exist")
    fun `sku 1 does not exist`() {
    }


}