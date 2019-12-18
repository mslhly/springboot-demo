package com.msl.aspose;

import com.lowagie.text.Font;
import com.lowagie.text.pdf.BaseFont;
import fr.opensagres.xdocreport.itext.extension.font.IFontProvider;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.awt.*;
import java.io.*;


public class PdfCover {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        try {
            InputStream is = new FileInputStream("/Users/msl/Desktop/关于确认2020年度个税专项附加扣除的通知.docx");
            // 1) Load docx with POI XWPFDocument
            XWPFDocument document = new XWPFDocument(is);
            // 2) Convert POI XWPFDocument 2 PDF with iText
            File outFile = new File( "/Users/msl/Desktop/789.pdf" );
            outFile.getParentFile().mkdirs();
            OutputStream out = new FileOutputStream( outFile );
            PdfOptions options = PdfOptions.create();
            //中文字体处理
            options.fontProvider(new IFontProvider() {
                @Override
                public Font getFont(String familyName, String encoding, float size, int style, Color color) {
                    try {
                        BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
                        Font fontChinese = new Font(bfChinese, size, style, color);
                        if (familyName != null){
                            fontChinese.setFamily(familyName);
                        }
                        return fontChinese;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            });
            PdfConverter.getInstance().convert( document, out, options );
            System.out.println("ok");
        } catch ( Throwable e ) {
            e.printStackTrace();
        }
        System.out.println( "Generate DocxBig.pdf with " + ( System.currentTimeMillis() - startTime ) + " ms." );
    }






}
