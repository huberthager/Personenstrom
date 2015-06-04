 // download jxl library from http://sourceforge.net/projects/jexcelapi/?source=typ_redirect

import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.write.*;

public class SimObserver {
	WritableWorkbook workbook;
	WritableSheet sheet;

	private enum SpreadSheet {
		SHEET_1("FREE_FLOW"), SHEET_2("DISTANCE_TO_GOAL"), SHEET_3("POSITION");
		String name;

		SpreadSheet(String name) {
			this.name = name;
		}

		private String getSheetName() {
			return name;
		}
	}

	public SimObserver() throws Exception {
		workbook = Workbook.createWorkbook(new File("data.xls"));

		fillSpreadSheet();
	}

	public void fillSpreadSheet() throws IOException, WriteException {
		int i = 0;
		for (SpreadSheet s : SpreadSheet.values()) {
			WritableSheet sheet = workbook.createSheet(s.getSheetName(), i++);

		}
		workbook.write();
		workbook.close();
	}

}