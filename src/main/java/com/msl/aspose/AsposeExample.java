package com.msl.aspose;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AsposeExample {


    public static void main(String[] args) throws Exception {
        doc2pdf("/Users/msl/Desktop/关于确认2020年度个税专项附加扣除的通知.docx", "/Users/msl/Desktop/123.pdf");
        pdfToImage("/Users/msl/Desktop/123.pdf");
    }


    public static void doc2pdf(String inPath, String outPath) throws Exception {
        System.out.println(inPath + " -> " + outPath);
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath);
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(inPath); // word文档
            // 支持RTF HTML,OpenDocument, PDF,EPUB, XPS转换
            doc.save(os, SaveFormat.PDF);
            long now = System.currentTimeMillis();
            System.out.println("convert OK! " + ((now - old) / 1000.0) + "秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void pdfToImage(String coverPdfPath) throws IOException {
        File file = new File(coverPdfPath);
        PDDocument doc = PDDocument.load(file);
        PDFRenderer renderer = new PDFRenderer(doc);
        try {
            int pageCount = doc.getNumberOfPages();
            for(int i=0; i<pageCount; i++){
                BufferedImage image = renderer.renderImage(i, 2.5f);
                ImageIO.write(image,"PNG",new File("/Users/msl/Desktop/image/"+i+".png"));
                image.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            doc.close();
            System.out.println("pdf："+coverPdfPath+"----转换完成");
        }
    }

}
