//説明
//http://www.gebish.org/manual/0.6.2/configuration.html#mechanisms_

////ドライバの指定("firefox", "ie", "chrome") デフォルトはfirefox
//driver = "chrome"
//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe")

//driver = "ie"
//System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe")


//スクリーンショットの設定
reportsDir = "target/geb-reports"
//true:試験失敗の場合のみキャプチャ取得 false:試験成功時にもキャプチャ取得
reportOnTestFailureOnly = false

//waitfor()の設定
waiting {
	timeout = 10
	retryInterval = 0.5
}
