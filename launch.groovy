//Uncommment this section to update device loader	// ScriptingEngine.copyGitFile("https://github.com/OperationSmallKat/SmallKat_V2.git",
//								"https://github.com/madhephaestus/Luna_copy.git", 
//								"loadRobot.groovy")
MobileBase robot= ScriptingEngine.gitScriptRun("https://github.com/madhephaestus/Luna_copy.git", 
								"loadRobot.groovy", 
	["https://github.com/madhephaestus/Luna_copy.git",
	"Luna_copy.xml",
	"GameController_22",
	"midnight",
	"Luna_copy"]);println robot