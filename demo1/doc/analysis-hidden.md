

<xml-fragment min="1" max="1" customWidth="false" hidden="false" style="0" width="11.52" collapsed="true" outlineLevel="0" xmlns:r="http://schemas.openxmlformats.org/officeDocument/2006/relationships"/>


	private boolean isHiddenColumn(Cell c) {
		Sheet sheet = c.getSheet();
		ColumnHelper ch = ((org.apache.poi.xssf.usermodel.XSSFSheet)sheet).getColumnHelper();
		CTCol column = ch.getColumn(c.getColumnIndex(), true);
		return (column != null) && (column.isSetHidden());
		
isSetHidden - returns whether the attribute is set (non null)

Correct implementation is getHidden()
