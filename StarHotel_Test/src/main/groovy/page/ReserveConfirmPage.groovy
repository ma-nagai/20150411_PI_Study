package page

import geb.Page


class ReserveConfirmPage extends Page {

	//ページのURL
	static File htmlFile = new File("reserveApp/check_info.html")
	static url = 'file:///' + htmlFile.getAbsolutePath().toString().replaceAll("\\\\","/")

	//ページタイトル
	static at = { title == "Reservation2" }

	//ページのコンテンツを定義する
	static content = {

		returnto_index {$("#returnto_index")}
		commit {$("#commit")}

	}

}
