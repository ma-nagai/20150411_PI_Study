package main

import geb.spock.GebSpec
import page.ReserveInputPage

//class ReserveInputMainTest extends GebReportingSpec {
class ReserveInputMainTest extends GebSpec {


	def ReserveInput_SimpleTest() {

		//事前処理
		given:
		//入力ページに移動
		to ReserveInputPage

		//期待される結果
		expect:
		//入力ページであることを確認
		at ReserveInputPage

		//条件
		//when:
		//宿泊日


		//宿泊数


		//人数

		//朝食バイキング

		//プラン

		//お名前

		//ボタン押下

		//結果
		//then:
		//確認画面であること

		//when:
		//ボタン押下

		//then:
		//結果画面であること


	}

}
