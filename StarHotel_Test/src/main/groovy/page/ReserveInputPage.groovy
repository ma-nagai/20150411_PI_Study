package page

import geb.Page


class ReserveInputPage extends Page {

	//ページのURL
	static File htmlFile = new File("reserveApp/index.html")
	static url = 'file:///' + htmlFile.getAbsolutePath().toString().replaceAll("\\\\","/")


	//ページタイトル
	static at = { title == "Reservation1" }

	//ページのコンテンツを定義する
	static content = {

		//宿泊日
		//年
		reserve_year { $("#reserve_year")}
		//月

		//日


		//宿泊数

		//人数

		//朝食バイキング

		//プラン

		//お名前

		//次へボタン


	}

}
