import jdk.jfr.Description

data class ToDoItem(var description: String, var status: Status){
    var items: List<ToDoItem> = listOf()

    override fun toString(): String {
        return("Описание: $description  Статус: $status ")
    }
}

enum class Status{
    DONE,ACTIVE
}
