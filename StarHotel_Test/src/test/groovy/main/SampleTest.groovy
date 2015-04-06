package main

import geb.Browser
import page.ReserveInputPage

Browser.drive {

	//画面を開く
	to ReserveInputPage

	//宿泊日
	reserve_year.value("2015")

	//月

	//日

	//宿泊数

	//人数

	//朝食バイキング

	//プラン

	//お名前


	//ボタン押下


}
