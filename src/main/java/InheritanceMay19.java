package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

public class InheritanceMay19 {
    public class Scholar {
        public String university;

        public Scholar(String u) {
            university = u;
        }

        int benefits(int qual) {
            return qual + 1;
        }

        int benefits() {
            return 1;
        }
        public boolean followsRules() {
            return true;
        }
    }

    public class Student extends Scholar {

        public String university;

        public Student(String u) {
            super(u);
        }
        @Override
        public boolean followsRules() {
            int x = 3;
            return super.followsRules();
        }

        public int benefits(int qual, String name) {
            return super.benefits(qual) + name.length();
        }

        public Float computeGPA() {
            return 4.0f;
        }
    }

    public static void main(String[] args) {
        System.out.println(new InheritanceMay19().new Student("UIC").benefits());
    }
}
