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

object June8:
  val listMilFs = List.fill(10000000)((i:Int)=>i+1)
  val result = listMilFs.foldLeft(0)((acc, f) => f(acc))
  val composedFunc = listMilFs.foldLeft(((i:Int)=>i))((acc, elem)=> acc andThen(elem))
  @main def runJune8 = println(result)
