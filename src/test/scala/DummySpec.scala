import org.scalatest._
import Matchers._

// http://www.scalatest.org/user_guide
class DummySpec extends WordSpec {

  val dummy = new Dummy

  "#add" when {
    "called with positive numbers" should {
      "add numbers" in {
        dummy.add(3, 5) shouldBe 82
      }
    }
  }

}
