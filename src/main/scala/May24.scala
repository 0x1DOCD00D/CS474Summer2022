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

object May24:
/*
  class DatabaseOps:
    def connect(login: String): Boolean = true
    def executeQuery(sql: String): String = "resulting data from the db"
*/
  trait DatabaseOps:
    def connect(login: String): Boolean
    def executeQuery(sql: String): String

  class MySqlDb extends DatabaseOps:
    def connect(login: String): Boolean = true
    def executeQuery(sql: String): String = "mysql result"

  class UserLhs(val db: DatabaseOps):
    def DoStuff(sql:String) =
      if db.connect("user=nygel;pswd=1334") then
        db.executeQuery(sql)

  @main def runMay24 = new UserLhs(new MySqlDb)
