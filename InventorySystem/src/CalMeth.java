
	import javax.script.ScriptEngine;
	import javax.script.ScriptEngineManager;
	import javax.script.ScriptException;

	public class CalMeth extends Cal {

		private static final long serialVersionUID = 1L;
		private static Boolean decBool = false;
		private static Boolean dispBool = false;
		private static Boolean equalsBool = false;
		private static Boolean addBool = false;
		private static Boolean subBool = false;
		private static Boolean mulBool = false;
		private static Boolean divBool = false;

		static void zero() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("0");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void one() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("1");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void two() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("2");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void three() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("3");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void four() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("4");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void five() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("5");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void six() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("6");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}
		static void seven() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("7");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void eight() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("8");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void nine() {
			if (equalsBool == true) {
				mainDisplay.setText("");
				subDisplay.setText("");
				equalsBool = false;
			}
			if (dispBool == false) {
				mainDisplay.setText("");
				dispBool = true;
			}
			mainDisplay.append("9");
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void decimal() {
			if (decBool == false) {
				mainDisplay.append(".");
			}
			decBool = true;
		}

		static void delete() {
			mainDisplay.setText("");
			subDisplay.setText("");
			decBool = false;
			dispBool = false;
			addBool = false;
			subBool = false;
			mulBool = false;
			divBool = false;
		}

		static void percentage() {
			double d = Double.parseDouble(mainDisplay.getText());
			d = d/100;
			String s = String.valueOf(d);
			mainDisplay.setText(s);
			decBool = false;
			dispBool = false;
		}

		static void sqr() {
			double d = Double.parseDouble(mainDisplay.getText());
			d = Math.pow(d,2);
			String s = String.valueOf(d);
			mainDisplay.setText(s);
			decBool = false;
			dispBool = false;
		}

		static void sqrRoot() {
			double d = Double.parseDouble(mainDisplay.getText());
			d = Math.sqrt(d);
			String s = String.valueOf(d);
			mainDisplay.setText(s);
			decBool = false;
			dispBool = false;
		}

		protected static void addition() {
			if (addBool == false) {
				subDisplay.append(mainDisplay.getText());
				mainDisplay.setText("");
				subDisplay.append(" + ");
				decBool = false;
				dispBool = false;
			}
			addBool = true;
		}

		static void subtraction() {
			if (subBool == false) {
				subDisplay.append(mainDisplay.getText());
				mainDisplay.setText("");
				subDisplay.append(" - ");
				decBool = false;
				dispBool = false;
			}
			subBool = true;
		}

		static void multiply() {
			if (mulBool == false) {
				subDisplay.append(mainDisplay.getText());
				mainDisplay.setText("");
				subDisplay.append(" x ");
				decBool = false;
				dispBool = false;
			}
			mulBool = true;
		}

		static void divide() {
			if (divBool == false) {
				subDisplay.append(mainDisplay.getText());
				mainDisplay.setText("");
				subDisplay.append(" \u00F7 ");
				decBool = false;
				dispBool = false;
			}
			divBool = true;
		}

		static void equals() throws ScriptException {
			equalsBool = true;
			subDisplay.append(mainDisplay.getText());
			mainDisplay.setText("");
			String foo = subDisplay.getText();
			if (foo.contains("x")) {
				foo.replaceAll("x","*");
			}
			if (foo.contains("\u00F7")) {
				foo.replaceAll("\u00F7","/");
			}
			if (foo.contains(" ")) {
				foo.replaceAll(" ","");
			}
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			String dis = String.valueOf(engine.eval(foo));
			mainDisplay.setText(dis);
			dispBool = false;
		}
	}


