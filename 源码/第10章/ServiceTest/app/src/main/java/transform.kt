open class Person(val name: String, val age: Int)

class Student(name: String, age: Int) : Person(name, age)

class Teacher(name: String, age: Int) : Person(name, age)

class SimpleData<out T>(val data: T?) {

    fun get(): T? {
        return data
    }

}

interface Transformer<in T> {
    fun transform(t: T): String
}

fun main() {
    val student = Student("Tom", 19)
    val data = SimpleData<Student>(student)
    handleMyData(data)
    val studentData = data.get()

    val trans = object : Transformer<Person> {
        override fun transform(t: Person): String {
            return "${t.name} ${t.age}"
        }
    }
    handleTransformer(trans)
}

fun handleMyData(data: SimpleData<Person>) {
    val personData = data.get()
}

fun handleTransformer(trans: Transformer<Student>) {
    val student = Student("Tom", 19)
    val result = trans.transform(student)
}