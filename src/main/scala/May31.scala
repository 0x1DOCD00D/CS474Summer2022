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

object May31FpScala:
  @main def runMay31 =
    val yourCustomOOImplVariable = new Function2[Int, Int, Unit]{
      override def apply(v1: Int, v2: Int): Unit = println(s"sum[$v1, $v2]= ${v1+v2}")
    }
    val intval = 10
    val f = (a:Int, b:Int)=>println(s"sum[$a, $b]= ${a+b}")
    println((a:Int, b:Int)=>println(s"sum[$a, $b]= ${a+b}"))
//    println(new AnyRef())
    println(f(3,7))
    println(yourCustomOOImplVariable(3,7))