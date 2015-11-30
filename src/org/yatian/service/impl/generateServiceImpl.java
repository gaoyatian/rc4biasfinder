package org.yatian.service.impl;

import java.util.Random;

import org.yatian.dao.keystreamDao;
import org.yatian.dao.impl.keystreamDaoImpl;
import org.yatian.entity.*;
import org.yatian.service.generateService;
/**
 * The service is to processed the data.
 * @author Yatian Gao
 *
 */

public class generateServiceImpl implements generateService {

	keystreamDao generatekeystream = new keystreamDaoImpl();
	@Override
	public void generate(keystream keystreamin) {
		
		
		int keylength = keystreamin.getKeylength();
		int times = keystreamin.getTimes();
		String plaintext = keystreamin.getPlaintext();
		byte input_data[] = plaintext.getBytes();
		
        while(times>0)
        {
		
	    String keygenerated = keystreamin.getRandomString(keylength);
	    byte[] keyStream = keystreamin.RC4Stream(input_data, keygenerated);
		
	    keystreamin.setPos0(keyStream[0]+128);
	    keystreamin.setPos1(keyStream[1]+128);
	    keystreamin.setPos2(keyStream[2]+128);
	    keystreamin.setPos3(keyStream[3]+128);
	    keystreamin.setPos4(keyStream[4]+128);
	    keystreamin.setPos5(keyStream[5]+128);
	    keystreamin.setPos6(keyStream[6]+128);
	    keystreamin.setPos7(keyStream[7]+128);
	    keystreamin.setPos8(keyStream[8]+128);
	    keystreamin.setPos9(keyStream[9]+128);
	    keystreamin.setPos10(keyStream[10]+128);
	    keystreamin.setPos11(keyStream[11]+128);
	    keystreamin.setPos12(keyStream[12]+128);
	    keystreamin.setPos13(keyStream[13]+128);
	    keystreamin.setPos14(keyStream[14]+128);
	    keystreamin.setPos15(keyStream[15]+128);
	    keystreamin.setPos16(keyStream[16]+128);
	    keystreamin.setPos17(keyStream[17]+128);
	    keystreamin.setPos18(keyStream[18]+128);
	    keystreamin.setPos19(keyStream[19]+128);
	    keystreamin.setPos20(keyStream[20]+128);
	    keystreamin.setPos21(keyStream[21]+128);
	    keystreamin.setPos22(keyStream[22]+128);
	    keystreamin.setPos23(keyStream[23]+128);
	    keystreamin.setPos24(keyStream[24]+128);
	    keystreamin.setPos25(keyStream[25]+128);
	    keystreamin.setPos26(keyStream[26]+128);
	    keystreamin.setPos27(keyStream[27]+128);
	    keystreamin.setPos28(keyStream[28]+128);
	    keystreamin.setPos29(keyStream[29]+128);
	    keystreamin.setPos30(keyStream[30]+128);
	    keystreamin.setPos31(keyStream[31]+128);
	    keystreamin.setPos32(keyStream[32]+128);
	    keystreamin.setPos33(keyStream[33]+128);
	    keystreamin.setPos34(keyStream[34]+128);
	    keystreamin.setPos35(keyStream[35]+128);
	    keystreamin.setPos36(keyStream[36]+128);
	    keystreamin.setPos37(keyStream[37]+128);
	    keystreamin.setPos38(keyStream[38]+128);
	    keystreamin.setPos39(keyStream[39]+128);
	    keystreamin.setPos40(keyStream[40]+128);
	    keystreamin.setPos41(keyStream[41]+128);
	    keystreamin.setPos42(keyStream[42]+128);
	    keystreamin.setPos43(keyStream[43]+128);
	    keystreamin.setPos44(keyStream[44]+128);
	    keystreamin.setPos45(keyStream[45]+128);
	    keystreamin.setPos46(keyStream[46]+128);
	    keystreamin.setPos47(keyStream[47]+128);
	    keystreamin.setPos48(keyStream[48]+128);
	    keystreamin.setPos49(keyStream[49]+128);
	    keystreamin.setPos50(keyStream[50]+128);
	    keystreamin.setPos51(keyStream[51]+128);
	    keystreamin.setPos52(keyStream[52]+128);
	    keystreamin.setPos53(keyStream[53]+128);
	    keystreamin.setPos54(keyStream[54]+128);
	    keystreamin.setPos55(keyStream[55]+128);
	    keystreamin.setPos56(keyStream[56]+128);
	    keystreamin.setPos57(keyStream[57]+128);
	    keystreamin.setPos58(keyStream[58]+128);
	    keystreamin.setPos59(keyStream[59]+128);
	    keystreamin.setPos60(keyStream[60]+128);
	    keystreamin.setPos61(keyStream[61]+128);
	    keystreamin.setPos62(keyStream[62]+128);
	    keystreamin.setPos63(keyStream[63]+128);
	    keystreamin.setPos64(keyStream[64]+128);
	    keystreamin.setPos65(keyStream[65]+128);
	    keystreamin.setPos66(keyStream[66]+128);
	    keystreamin.setPos67(keyStream[67]+128);
	    keystreamin.setPos68(keyStream[68]+128);
	    keystreamin.setPos69(keyStream[69]+128);
	    keystreamin.setPos70(keyStream[70]+128);
	    keystreamin.setPos71(keyStream[71]+128);
	    keystreamin.setPos72(keyStream[72]+128);
	    keystreamin.setPos73(keyStream[73]+128);
	    keystreamin.setPos74(keyStream[74]+128);
	    keystreamin.setPos75(keyStream[75]+128);
	    keystreamin.setPos76(keyStream[76]+128);
	    keystreamin.setPos77(keyStream[77]+128);
	    keystreamin.setPos78(keyStream[78]+128);
	    keystreamin.setPos79(keyStream[79]+128);
	    keystreamin.setPos80(keyStream[80]+128);
	    keystreamin.setPos81(keyStream[81]+128);
	    keystreamin.setPos82(keyStream[82]+128);
	    keystreamin.setPos83(keyStream[83]+128);
	    keystreamin.setPos84(keyStream[84]+128);
	    keystreamin.setPos85(keyStream[85]+128);
	    keystreamin.setPos86(keyStream[86]+128);
	    keystreamin.setPos87(keyStream[87]+128);
	    keystreamin.setPos88(keyStream[88]+128);
	    keystreamin.setPos89(keyStream[89]+128);
	    keystreamin.setPos90(keyStream[90]+128);
	    keystreamin.setPos91(keyStream[91]+128);
	    keystreamin.setPos92(keyStream[92]+128);
	    keystreamin.setPos93(keyStream[93]+128);
	    keystreamin.setPos94(keyStream[94]+128);
	    keystreamin.setPos95(keyStream[95]+128);
	    keystreamin.setPos96(keyStream[96]+128);
	    keystreamin.setPos97(keyStream[97]+128);
	    keystreamin.setPos98(keyStream[98]+128);
	    keystreamin.setPos99(keyStream[99]+128);
	    keystreamin.setPos100(keyStream[100]+128);
	    keystreamin.setPos101(keyStream[101]+128);
	    keystreamin.setPos102(keyStream[102]+128);
	    keystreamin.setPos103(keyStream[103]+128);
	    keystreamin.setPos104(keyStream[104]+128);
	    keystreamin.setPos105(keyStream[105]+128);
	    keystreamin.setPos106(keyStream[106]+128);
	    keystreamin.setPos107(keyStream[107]+128);
	    keystreamin.setPos108(keyStream[108]+128);
	    keystreamin.setPos109(keyStream[109]+128);
	    keystreamin.setPos110(keyStream[110]+128);
	    keystreamin.setPos111(keyStream[111]+128);
	    keystreamin.setPos112(keyStream[112]+128);
	    keystreamin.setPos113(keyStream[113]+128);
	    keystreamin.setPos114(keyStream[114]+128);
	    keystreamin.setPos115(keyStream[115]+128);
	    keystreamin.setPos116(keyStream[116]+128);
	    keystreamin.setPos117(keyStream[117]+128);
	    keystreamin.setPos118(keyStream[118]+128);
	    keystreamin.setPos119(keyStream[119]+128);
	    keystreamin.setPos120(keyStream[120]+128);
	    keystreamin.setPos121(keyStream[121]+128);
	    keystreamin.setPos122(keyStream[122]+128);
	    keystreamin.setPos123(keyStream[123]+128);
	    keystreamin.setPos124(keyStream[124]+128);
	    keystreamin.setPos125(keyStream[125]+128);
	    keystreamin.setPos126(keyStream[126]+128);
	    keystreamin.setPos127(keyStream[127]+128);
	    

	   
		generatekeystream.savestream(keystreamin);
		times--;
        }
		
	}
	@Override
	public valueDistribution valueDistribution(int id,int value) {
		
		keystream temp = new keystream();
		valueDistribution valueDis = new valueDistribution();
		int[] counter = new int[128];
		int[] result = new int[128];
		
		for(int count=0;count<128;count++)
		{
			result[count]=0;
			counter[count]=0;
		}
	
		for(;id>0;id--)
		{
			
			temp = generatekeystream.findById(id);
		    
			counter[0]=temp.getPos0();
			counter[1]=temp.getPos1();
			counter[2]=temp.getPos2();
			counter[3]=temp.getPos3();
			counter[4]=temp.getPos4();
			counter[5]=temp.getPos5();
			counter[6]=temp.getPos6();
			counter[7]=temp.getPos7();
			counter[8]=temp.getPos8();
			counter[9]=temp.getPos9();
			counter[10]=temp.getPos10();
			counter[11]=temp.getPos11();
			counter[12]=temp.getPos12();
			counter[13]=temp.getPos13();
			counter[14]=temp.getPos14();
			counter[15]=temp.getPos15();
			counter[16]=temp.getPos16();
			counter[17]=temp.getPos17();
			counter[18]=temp.getPos18();
			counter[19]=temp.getPos19();
			counter[20]=temp.getPos20();
			counter[21]=temp.getPos21();
			counter[22]=temp.getPos22();
			counter[23]=temp.getPos23();
			counter[24]=temp.getPos24();
			counter[25]=temp.getPos25();
			counter[26]=temp.getPos26();
			counter[27]=temp.getPos27();
			counter[28]=temp.getPos28();
			counter[29]=temp.getPos29();
			counter[30]=temp.getPos30();
			counter[31]=temp.getPos31();
			counter[32]=temp.getPos32();
			counter[33]=temp.getPos33();
			counter[34]=temp.getPos34();
			counter[35]=temp.getPos35();
			counter[36]=temp.getPos36();
			counter[37]=temp.getPos37();
			counter[38]=temp.getPos38();
			counter[39]=temp.getPos39();
			counter[40]=temp.getPos40();
			counter[41]=temp.getPos41();
			counter[42]=temp.getPos42();
			counter[43]=temp.getPos43();
			counter[44]=temp.getPos44();
			counter[45]=temp.getPos45();
			counter[46]=temp.getPos46();
			counter[47]=temp.getPos47();
			counter[48]=temp.getPos48();
			counter[49]=temp.getPos49();
			counter[50]=temp.getPos50();
			counter[51]=temp.getPos51();
			counter[52]=temp.getPos52();
			counter[53]=temp.getPos53();
			counter[54]=temp.getPos54();
			counter[55]=temp.getPos55();
			counter[56]=temp.getPos56();
			counter[57]=temp.getPos57();
			counter[58]=temp.getPos58();
			counter[59]=temp.getPos59();
			counter[60]=temp.getPos60();
			counter[61]=temp.getPos61();
			counter[62]=temp.getPos62();
			counter[63]=temp.getPos63();
			counter[64]=temp.getPos64();
			counter[65]=temp.getPos65();
			counter[66]=temp.getPos66();
			counter[67]=temp.getPos67();
			counter[68]=temp.getPos68();
			counter[69]=temp.getPos69();
			counter[70]=temp.getPos70();
			counter[71]=temp.getPos71();
			counter[72]=temp.getPos72();
			counter[73]=temp.getPos73();
			counter[74]=temp.getPos74();
			counter[75]=temp.getPos75();
			counter[76]=temp.getPos76();
			counter[77]=temp.getPos77();
			counter[78]=temp.getPos78();
			counter[79]=temp.getPos79();
			counter[80]=temp.getPos80();
			counter[81]=temp.getPos81();
			counter[82]=temp.getPos82();
			counter[83]=temp.getPos83();
			counter[84]=temp.getPos84();
			counter[85]=temp.getPos85();
			counter[86]=temp.getPos86();
			counter[87]=temp.getPos87();
			counter[88]=temp.getPos88();
			counter[89]=temp.getPos89();
			counter[90]=temp.getPos90();
			counter[91]=temp.getPos91();
			counter[92]=temp.getPos92();
			counter[93]=temp.getPos93();
			counter[94]=temp.getPos94();
			counter[95]=temp.getPos95();
			counter[96]=temp.getPos96();
			counter[97]=temp.getPos97();
			counter[98]=temp.getPos98();
			counter[99]=temp.getPos99();
			counter[100]=temp.getPos100();
			counter[101]=temp.getPos101();
			counter[102]=temp.getPos102();
			counter[103]=temp.getPos103();
			counter[104]=temp.getPos104();
			counter[105]=temp.getPos105();
			counter[106]=temp.getPos106();
			counter[107]=temp.getPos107();
			counter[108]=temp.getPos108();
			counter[109]=temp.getPos109();
			counter[110]=temp.getPos110();
			counter[111]=temp.getPos111();
			counter[112]=temp.getPos112();
			counter[113]=temp.getPos113();
			counter[114]=temp.getPos114();
			counter[115]=temp.getPos115();
			counter[116]=temp.getPos116();
			counter[117]=temp.getPos117();
			counter[118]=temp.getPos118();
			counter[119]=temp.getPos119();
			counter[120]=temp.getPos120();
			counter[121]=temp.getPos121();
			counter[122]=temp.getPos122();
			counter[123]=temp.getPos123();
			counter[124]=temp.getPos124();
			counter[125]=temp.getPos125();
			counter[126]=temp.getPos126();
			counter[127]=temp.getPos127();
	
			
			//This loop is used to select the value you want.
			for(int i=0;i<128;i++)
			{
				if(counter[i]==value)
				{
					result[i] = result[i] + 1;
				}
			}
		
		}
		
		valueDis.setPos0(result[0]);
		valueDis.setPos1(result[1]);
		valueDis.setPos2(result[2]);
		valueDis.setPos3(result[3]);
		valueDis.setPos4(result[4]);
		valueDis.setPos5(result[5]);
		valueDis.setPos6(result[6]);
		valueDis.setPos7(result[7]);
		valueDis.setPos8(result[8]);
		valueDis.setPos9(result[9]);
		valueDis.setPos10(result[10]);
		valueDis.setPos11(result[11]);
		valueDis.setPos12(result[12]);
		valueDis.setPos13(result[13]);
		valueDis.setPos14(result[14]);
		valueDis.setPos15(result[15]);
		valueDis.setPos16(result[16]);
		valueDis.setPos17(result[17]);
		valueDis.setPos18(result[18]);
		valueDis.setPos19(result[19]);
		valueDis.setPos20(result[20]);
		valueDis.setPos21(result[21]);
		valueDis.setPos22(result[22]);
		valueDis.setPos23(result[23]);
		valueDis.setPos24(result[24]);
		valueDis.setPos25(result[25]);
		valueDis.setPos26(result[26]);
		valueDis.setPos27(result[27]);
		valueDis.setPos28(result[28]);
		valueDis.setPos29(result[29]);
		valueDis.setPos30(result[30]);
		valueDis.setPos31(result[31]);
		valueDis.setPos32(result[32]);
		valueDis.setPos33(result[33]);
		valueDis.setPos34(result[34]);
		valueDis.setPos35(result[35]);
		valueDis.setPos36(result[36]);
		valueDis.setPos37(result[37]);
		valueDis.setPos38(result[38]);
		valueDis.setPos39(result[39]);
		valueDis.setPos40(result[40]);
		valueDis.setPos41(result[41]);
		valueDis.setPos42(result[42]);
		valueDis.setPos43(result[43]);
		valueDis.setPos44(result[44]);
		valueDis.setPos45(result[45]);
		valueDis.setPos46(result[46]);
		valueDis.setPos47(result[47]);
		valueDis.setPos48(result[48]);
		valueDis.setPos49(result[49]);
		valueDis.setPos50(result[50]);
		valueDis.setPos51(result[51]);
		valueDis.setPos52(result[52]);
		valueDis.setPos53(result[53]);
		valueDis.setPos54(result[54]);
		valueDis.setPos55(result[55]);
		valueDis.setPos56(result[56]);
		valueDis.setPos57(result[57]);
		valueDis.setPos58(result[58]);
		valueDis.setPos59(result[59]);
		valueDis.setPos60(result[60]);
		valueDis.setPos61(result[61]);
		valueDis.setPos62(result[62]);
		valueDis.setPos63(result[63]);
		valueDis.setPos64(result[64]);
		valueDis.setPos65(result[65]);
		valueDis.setPos66(result[66]);
		valueDis.setPos67(result[67]);
		valueDis.setPos68(result[68]);
		valueDis.setPos69(result[69]);
		valueDis.setPos70(result[70]);
		valueDis.setPos71(result[71]);
		valueDis.setPos72(result[72]);
		valueDis.setPos73(result[73]);
		valueDis.setPos74(result[74]);
		valueDis.setPos75(result[75]);
		valueDis.setPos76(result[76]);
		valueDis.setPos77(result[77]);
		valueDis.setPos78(result[78]);
		valueDis.setPos79(result[79]);
		valueDis.setPos80(result[80]);
		valueDis.setPos81(result[81]);
		valueDis.setPos82(result[82]);
		valueDis.setPos83(result[83]);
		valueDis.setPos84(result[84]);
		valueDis.setPos85(result[85]);
		valueDis.setPos86(result[86]);
		valueDis.setPos87(result[87]);
		valueDis.setPos88(result[88]);
		valueDis.setPos89(result[89]);
		valueDis.setPos90(result[90]);
		valueDis.setPos91(result[91]);
		valueDis.setPos92(result[92]);
		valueDis.setPos93(result[93]);
		valueDis.setPos94(result[94]);
		valueDis.setPos95(result[95]);
		valueDis.setPos96(result[96]);
		valueDis.setPos97(result[97]);
		valueDis.setPos98(result[98]);
		valueDis.setPos99(result[99]);
		valueDis.setPos100(result[100]);
		valueDis.setPos101(result[101]);
		valueDis.setPos102(result[102]);
		valueDis.setPos103(result[103]);
		valueDis.setPos104(result[104]);
		valueDis.setPos105(result[105]);
		valueDis.setPos106(result[106]);
		valueDis.setPos107(result[107]);
		valueDis.setPos108(result[108]);
		valueDis.setPos109(result[109]);
		valueDis.setPos110(result[110]);
		valueDis.setPos111(result[111]);
		valueDis.setPos112(result[112]);
		valueDis.setPos113(result[113]);
		valueDis.setPos114(result[114]);
		valueDis.setPos115(result[115]);
		valueDis.setPos116(result[116]);
		valueDis.setPos117(result[117]);
		valueDis.setPos118(result[118]);
		valueDis.setPos119(result[119]);
		valueDis.setPos120(result[120]);
		valueDis.setPos121(result[121]);
		valueDis.setPos122(result[122]);
		valueDis.setPos123(result[123]);
		valueDis.setPos124(result[124]);
		valueDis.setPos125(result[125]);
		valueDis.setPos126(result[126]);
		valueDis.setPos127(result[127]);
		
		
		
		
		return valueDis;
	}
	

}
