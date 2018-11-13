package com.sherlockkk.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PoiExcelUtil {
    public static void main(String[] args) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("测试sheet");
        for (int i = 0; i < 10; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue("lalal啊啊啊  " + i + " " + j);
                sheet.autoSizeColumn(j);
            }
        }

        OutputStream fileOutputStream = new FileOutputStream("workbook.xlsx");
        workbook.write(fileOutputStream);
    }
}
