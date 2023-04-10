package service;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import vo.ProductVO;

public class ProductService {
	private static ProductService instance = new ProductService();
	private ArrayList<ProductVO> list;
	
	private ProductService() {
		 fileLoad();
	}
	
	private void fileLoad() {
		list = new ArrayList<ProductVO>();
		
		try(FileInputStream fis = new FileInputStream("product.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);){
			while(true) {
				ProductVO vo = (ProductVO) ois.readObject();
				list.add(vo);
			}
		} catch (FileNotFoundException e) {
			System.out.println("제품 정보 데이터 파일이 없습니다.");
		}catch (EOFException e) {
			System.out.println("제품 정보 데이터 파일 로드 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public void  fileSave() {
		try (FileOutputStream fos = new FileOutputStream("product.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			for (int i = 0; i < list.size(); i++) {
				oos.writeObject(list.get(i));
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ProductService getInstance() {
		if(instance == null)
			instance = new ProductService();
		return instance;
	}
	//제품정보 등록
	public  void appendProduct(ProductVO productVO) {
		list.add(productVO); 
		fileSave();
		
	}
	//제품정보 전체 출력
	public ArrayList<ProductVO> getList() {
		return list;
	}
	//가장 비싼 제품 조회
	public ArrayList<ProductVO> maxPriceProductList(){
		ArrayList<ProductVO> rList = new ArrayList<ProductVO>();
		
		//1. 제품 가격 중 최대값
		int max = 0;
		for(ProductVO vo : list) {
			if(max < vo.getPrice())
				max = vo.getPrice();
		}
		//2. 제품가격 최대값과 같은 제품을 리스트에 저장
		for(ProductVO vo : list) {
			if(max == vo.getPrice())
				rList.add(vo);
		}
		
		return rList;
	}
	//제품 검색
	public ProductVO searchProduct(String productNo) {
		int i = list.indexOf(new ProductVO(productNo, null, null, 0, 0));
		if(i == -1)
			return null;
		return list.get(i);
	}
	

	
	public void exportCSV() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		String fileName = sdf.format(Calendar.getInstance().getTime()) + "_product.csv"; //Calendar.getInstance().getTime() 현재시간 가져오기
		
		String content = new String();
		for (int i = 0; i < list.size(); i++) {
			content += list.get(i).getData() + "\n"; //csv는 줄바꿈을 하면 데이터가 입력된다.데이터를 쓸떄는 콤마로 구분
		}
		
		try(FileWriter fw = new FileWriter(fileName,Charset.forName("EUC-KR"));
				PrintWriter pw = new PrintWriter(fw);){
			pw.print(content);
			pw.flush(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}//class










