package page

import geb.Page


class ReserveInputPage extends Page {

	//ページのURL
	static File htmlFile = new File("reserveApp/index.html")
	static url = 'file:///' + htmlFile.getAbsolutePath().toString().replaceAll("\\\\","/")

	//ページタイトル
	static at = { title == "Reservation" }

	//ページのコンテンツを定義する
	static content = {

	}


	//入力画面の値の入力を行うメソッドを実装する
	void testInput(){


	}



}
