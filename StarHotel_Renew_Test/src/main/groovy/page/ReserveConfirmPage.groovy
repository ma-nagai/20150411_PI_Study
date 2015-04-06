package page

import geb.Page


//class ReserveConfirmPage {
class ReserveConfirmPage extends Page {

	//ページのURL
	static File htmlFile = new File("reserveApp/index.html")
	static url = 'file:///' + htmlFile.getAbsolutePath().toString().replaceAll("\\\\","/")

	//ページタイトル
	static at = { title == "Reservation" }

	//ページのコンテンツを定義する
	static content = {

	}

}
