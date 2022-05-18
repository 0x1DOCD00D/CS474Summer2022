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

object May16:
  val j = 3
  def f(i:Int):Int = i*j
  def g(proc: Int=>Int):Int = proc(3)
  @main def RunMay16=//(input:String) =
    //require(input != null)
    lazy val somescopeRenamed = {
      val george = "student"
      println(george)
      george.length
    }

    println(g(f))
    //somescopeRenamed = "mark"
    println(somescopeRenamed)
    println(somescopeRenamed)
