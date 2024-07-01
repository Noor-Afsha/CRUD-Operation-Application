//package com.ApplicationForms.project.utilClass;
//
//import java.io.ByteArrayOutputStream;
//import java.util.zip.Deflater;
//import java.util.zip.Inflater;
//
//public class ImageUtil {
//
//	public static byte[] compressImage(byte[] data) {
//		Deflater deflater=new Deflater();
//		deflater.setLevel(Deflater.BEST_COMPRESSION);
//		deflater.setInput(data);
//		deflater.finish();
//		
//		ByteArrayOutputStream in=new ByteArrayOutputStream(data.length);
//		byte[] temp =new byte[4*1024];
//		while(!deflater.finished()) {
//			int size=deflater.deflate(temp);
//			in.write(temp, 0, size);
//		}
//		try {
//			in.close();
//			
//		} catch (Exception ignored) {
//		}
//	return in.toByteArray();
//}
//	
//	public static byte[] decompressImage(byte[] data) {
//		Inflater inflater=new Inflater();
//		inflater.setInput(data);
//		ByteArrayOutputStream ot=new ByteArrayOutputStream(data.length);
//		byte[] tmp =new byte[4*1024];
//		try {
//			while(!inflater.finished()) {
//				int count=inflater.inflate(tmp);
//				ot.write(tmp, 0, count);
//			}
//			ot.close();
//		} catch (Exception ignored) {
//		}
//		return ot.toByteArray();
//		
//	}
//}