package com.uic.cs474

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

object May25:
  trait UserofServiceLhs:
    def getService(s:Adapter) = s.doSomething(1)

  trait Adapter:
    this: ServiceRhs =>
    def doSomething(i: Int): String = doSomething(i, 0)

  trait ServiceRhs:
    //def doSomething(i: Int): String = doSomething(i, 0)
    def doSomething(i1: Int, i2:Float): String

  val user = new UserofServiceLhs {}
  class SomeService extends ServiceRhs with Adapter{
    override def doSomething(i1: Int, i2: Float): String = "..."
  }
  user.getService(new SomeService)


  class Student
  trait Mask
  trait Hat
  trait Lunette

  //class StudentWithHat extends Hat
  val george = new Student with Hat



  class ExperimentWithThisSuper {
    val ohmy = {
      println(this.toString)
      this
    }
  }
  @main def runMay25 = println(new ExperimentWithThisSuper().ohmy.toString)
