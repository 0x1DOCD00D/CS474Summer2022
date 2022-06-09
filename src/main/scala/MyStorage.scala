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

abstract class MyStorage[+T]:
  val myStore:T
class IntStorage(override val myStore:Int) extends MyStorage[Int]
class StringStorage(override val myStore:String) extends MyStorage[String]

object MyStorage:
  @main def runMyStore =
    val is = new IntStorage(3)
    val ms: MyStorage[Any] = is
    println(ms.myStore)
