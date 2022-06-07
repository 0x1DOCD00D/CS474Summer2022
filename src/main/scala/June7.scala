package com.uic.cs474

import scala.concurrent.Future
import scala.util.{Failure, Success}

/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *   
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *  
 */

def looongFilteringMethod(v: String): Boolean =
  true

object June7:
  case class Field(name:String)
  case class SomeRecord[T](private var storage: T):
    def map[S](f: Function1[T,S]): SomeRecord[S] =
      SomeRecord(f(storage))
    def flatMap[S](f: T => SomeRecord[S]): SomeRecord[S] =
      f(storage)
    def filter(pred: T => Boolean): Option[SomeRecord[T]] =
      if pred(storage) then Some(SomeRecord(storage))
      else None

  @main def runMonads =
    import concurrent.ExecutionContext.Implicits.global

    val lil = List("ian").flatMap(x=>x)
    val ril = List("ian").flatMap(x=>List(x))
    val al = List("ian", "alex").flatMap(x=>x).flatMap(x=>List(x))

    val x: Future[String] = Future {
      "CS474"
    }

    val result = for {
      v <- SomeRecord("Ian")
      res = looongFilteringMethod(v)
      _ = println(v)
    } yield res
    println(result)

    println(SomeRecord("George")
      .filter(looongFilteringMethod)
      .map(e=>":")
      .map(_.size)
  //    .flatMap(e=>SomeRecord(e+3))
      .map(_.toString.concat("Alex"))
      .filter(e => e.size < 2)
    )
