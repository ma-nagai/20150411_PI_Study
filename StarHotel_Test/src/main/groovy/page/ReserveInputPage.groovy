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
		reserve_month { $("#reserve_month") }
		//日
		reserve_day { $("#reserve_day") }

		//宿泊数
		reserve_term { $("#reserve_term") }

		//人数
		headcount { $("#headcount") }

		//朝食バイキング
		breakfast { $("input" , name:"bf")}

		//プラン
		plan_a { $("input", type: "checkbox", id: "plan_a")}
		plan_b { $("input", type: "checkbox", id: "plan_b")}


		//お名前
		guestname { $("#guestname") }

		//次へボタン
		goto_next { $("#goto_next") }

	}

}
