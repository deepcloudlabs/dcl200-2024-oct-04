package com.example;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class TestMemoryMappedFile {

	public static void main(String[] args) {
		File file = new File("src/data", "sample.txt");
		try (@SuppressWarnings("resource")
		FileChannel fc = new RandomAccessFile(file, "rw").getChannel();) {
			MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_WRITE, 0, (int) fc.size());
			buffer.position((int) fc.size());
			buffer.put("deneme".getBytes());
			buffer.force();
			fc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
