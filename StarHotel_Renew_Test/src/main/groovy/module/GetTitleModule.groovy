package module

import geb.Module

class GetTitleModule extends Module{


	static content = {
		 getbutton { $("input", type: "submit",0) }

	}

}
