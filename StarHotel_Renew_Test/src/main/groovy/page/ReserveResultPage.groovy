package page

import geb.Page

public class ReserveResultPage extends Page {

	//ページのURL
	static File htmlFile = new File("reserveApp/index.html")
	static url = 'file:///' + htmlFile.getAbsolutePath().toString().replaceAll("\\\\","/")

	//ページタイトル
	static at = { title == "Reservation" }

	static content = {


	}

}
