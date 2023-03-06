abstract class Child_books: Pr_Book{
 override fun Books_child(){
    println(" Название книги $name Автор $avtor Год выпуска $year Объем  в листах $q")
}
   override fun yearAvtor(){
        when{
                (yearAvtor()<1870)->println("Книга выпустилась в 19 веке")
        }
    }

}