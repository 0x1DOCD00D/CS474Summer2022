package com.uic.cs474;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

class Parent{
    int field = 1;
}

interface Mother{
    boolean giveBirth();
}
interface Father{
    boolean provideGrowth();
}

class ProperChild implements Father, Mother{
    @Override
    public boolean giveBirth() {
        return false;
    }

    @Override
    public boolean provideGrowth() {
        return false;
    }
}

class Child extends Parent {
    int field = 2;
}

public class FieldExperiment {
    public String meth(Father fo){
        return fo.toString();
    }
    public static void main(String[] args) {
        Father father = new ProperChild();
        father.provideGrowth();
        System.out.println( new FieldExperiment().meth(father));
        System.out.println( new FieldExperiment().meth(new ProperChild()));
        Parent p1 = new Parent();
        Child c1 = new Child();
        Parent c2 = new Child();
        System.out.println(p1.field);
        System.out.println(c1.field);
        System.out.println(c2.field);
        System.out.println(new Child().field);
    }
}
