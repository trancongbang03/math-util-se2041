package com.phucpd.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
        //REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCE CODE
//CODE MỚI KHI ĐC ĐƯA LÊN SERVER, PHẢI ĐC CHECK LẠI NGAY Ở NHÁNH DEV, HOẶC KHI ĐƯA VÀO NHÁNH MAIN THÌ CX PHẢI ĐC CHECK ĐỂ ĐẢM BẢO RẰNG NÓ MÀU XANH, PASSED CÁC TEST CASE
//LÝ DO: HÀM THÌ PHẢI CHẠY ĐÚNG!!!!!!!!
//NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT NHANH, RẤT TIỆN DO UNIT TEST
        // KHI PHỐI HOP VỚI SCRIPT (.YAML) SẼ TỰ ĐỘNG ĐC RUN VÀ TỰ BÁO MÀU XANH ĐỎ VÀ HIỆN EMAIL NẾU ĐỎ
        // TEST LẠI THỨ ĐÃ TỪNG TEST ĐỂ CHẮC CHẮN RẰNG NÓ VẪN CÒN ỔN

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Invalid parameter. n must be between 0 and 20"
            );
        }

        if (n == 0 || n == 1) {
            return 1;// n = 0 hay =1  return ngay
        }
        return  n * getFactorial(n - 1);
//
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
    }
}