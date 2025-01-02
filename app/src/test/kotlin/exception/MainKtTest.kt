package exception
import kotlin.test.Test
import kotlin.test.assertTrue
import org.junit.jupiter.api.Assertions.*

class MainKtTest {

  private val convertStrToIntTest:ConvertFun = ConvertFun()
  @Test fun `should convert valid string to integer`(){
   val validResult = convertStrToIntTest.convertStrToInt("123")
   val invalidResult = "123"

   assertNotEquals(invalidResult, validResult)


  }
 }