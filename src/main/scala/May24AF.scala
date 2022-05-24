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

object May24AF:
  trait AbstractPhone
  object PhoneAbstractFactory:
    class Iphone extends AbstractPhone
    class SamsungPhone extends AbstractPhone
    class Motorola extends AbstractPhone
    class Nokia extends AbstractPhone

    def apply(phoneType: Int): AbstractPhone =
      phoneType match
        case 1 => new Iphone
        case 2 => new SamsungPhone
        case 3 => new Motorola
        case 4 =>  new Nokia
        case _ => throw new NoSuchElementException("ouch!")

  class phoneClient:
    def usePhone(pt: Int) =
      val phone = PhoneAbstractFactory(pt)
      phone

  @main def runAF = println("af")
