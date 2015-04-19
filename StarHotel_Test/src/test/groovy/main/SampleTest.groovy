package main

import geb.Browser
import page.ReserveInputPage

Browser.drive {

	//画面を開く
	to ReserveInputPage

	//宿泊日
	reserve_year.value("2015")
	reserve_month.value("4")
	reserve_day.value("30")


	//宿泊数
	reserve_term.value("2")

	//人数
	headcount.value("3")

	//朝食バイキング
	breakfast.value("off")

	//プラン
	plan_b.value(true)

	//お名前
	guestname.value("test")

	sleep(5000)

	//ボタン押下
	goto_next.click()

	commit.click()
}
