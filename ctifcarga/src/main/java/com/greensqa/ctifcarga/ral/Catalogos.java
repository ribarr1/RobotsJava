package com.greensqa.ctifcarga.ral;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import oracle.net.aso.t;


public class Catalogos {
	 Random rnd = new Random();
	 List<String> Calificacion = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	 List<String> CategoriaValorizacion = new ArrayList<String>(Arrays.asList("FL","LI"));
	 List<String> Ciiu = new ArrayList<String>(Arrays.asList("0010","0090","0111","0112","0113","0114","0115","0119","0121","0122","0123","0124","0125","0126","0127","0128","0129","0130","0141","0142","0143","0144","0145","0149","0150","0161","0162","0163","0164","0170","0210","0220","0230","0240","0311","0312","0321","0322","0510","0520","0610","0620","0710","0721","0722","0723","0729","0811","0812","0820","0891","0892","0899","0910","0990","1011","1012","1020","1030","1040","1051","1052","1061","1062","1063","1071","1072","1081","1082","1083","1084","1089","1090","1101","1102","1103","1104","1200","1311","1312","1313","1391","1392","1393","1394","1399","1410","1420","1430","1511","1512","1513","1521","1522","1523","1610","1620","1630","1640","1690","1701","1702","1709","1811","1812","1820","1910","1921","1922","2011","2012","2013","2014","2021","2022","2023","2029","2030","2100","2211","2212","2219","2221","2229","2310","2391","2392","2393","2394","2395","2396","2399","2410","2421","2429","2431","2432","2511","2512","2513","2520","2591","2592","2593","2599","2610","2620","2630","2640","2651","2652","2660","2670","2680","2711","2712","2720","2731","2732","2740","2750","2790","2811","2812","2813","2814","2815","2816","2817","2818","2819","2821","2822","2823","2824","2825","2826","2829","2910","2920","2930","3011","3012","3020","3030","3040","3091","3092","3099","3110","3120","3210","3220","3230","3240","3250","3290","3311","3312","3313","3314","3315","3319","3320","3511","3512","3513","3514","3520","3530","3600","3700","3811","3812","3821","3822","3830","3900","4111","4112","4210","4220","4290","4311","4312","4321","4322","4329","4330","4390","4511","4512","4520","4530","4541","4542","4610","4620","4631","4632","4641","4642","4643","4644","4645","4649","4651","4652","4653","4659","4661","4662","4663","4664","4665","4669","4690","4711","4719","4721","4722","4723","4724","4729","4731","4732","4741","4742","4751","4752","4753","4754","4755","4759","4761","4762","4769","4771","4772","4773","4774","4775","4781","4782","4789","4791","4792","4799","4911","4912","4921","4922","4923","4930","5011","5012","5021","5022","5111","5112","5121","5122","5210","5221","5222","5223","5224","5229","5310","5320","5511","5512","5513","5514","5519","5520","5530","5590","5611","5612","5613","5619","5621","5629","5630","5811","5812","5813","5819","5820","5911","5912","5913","5914","5920","6010","6020","6110","6120","6130","6190","6201","6202","6209","6311","6312","6391","6399","6411","6412","6421","6422","6423","6424","6431","6432","6491","6492","6493","6494","6495","6499","6511","6512","6513","6514","6521","6522","6531","6532","6611","6612","6613","6614","6615","6619","6621","6629","6630","6810","6820","6910","6920","7010","7020","7110","7120","7210","7220","7310","7320","7410","7420","7490","7500","7710","7721","7722","7729","7730","7740","7810","7820","7830","7911","7912","7990","8010","8020","8030","8110","8121","8129","8130","8211","8219","8220","8230","8291","8292","8299","8411","8412","8413","8414","8415","8421","8422","8423","8424","8430","8511","8512","8513","8521","8522","8523","8530","8541","8542","8543","8544","8551","8552","8553","8559","8560","8610","8621","8622","8691","8692","8699","8710","8720","8730","8790","8810","8890","9001","9002","9003","9004","9005","9006","9007","9008","9101","9102","9103","9200","9311","9312","9319","9321","9329","9411","9412","9420","9491","9492","9499","9511","9512","9521","9522","9523","9524","9529","9601","9602","9603","9609","9700","9810","9820","9900"));
	 List<String> ClasesCarteras = new ArrayList<String>(Arrays.asList("C","O","M","B"));
	 List<String> Dane = new ArrayList<String>(Arrays.asList("00001","00002","00003","00004","05002","54003","05042","50006","27006","41006","13006","41013","25001","20011","68013","17013","85010","20013","41016","25019","18029","44035","68020","52019","76020","52022","05021","47030","41020","19022","15022","73024","41026","27025","13030","73026","05030","05031","73030","25035","52036","76036","05034","05036","05038","25040","05040","17042","76041","05044","73043","05045","66045","25599","15047","47053","17050","68051","81001","81065","25053","52051","54051","05051","15051","13042","05055","19050","76054","47058","13052","05059","63001","73055","13062","20032","73067","27050","23068","27073","27075","27077","19075","66075","08078","41078","52079","05079","68077","68079","50110","68081","44078","13074","94343","08001","20045","17088","18094","66088","15087","52083","05088","05086","25086","15090","05091","15092","05093","68092","25095","15097","54099","11001","25099","27099","19100","68101","76100","20060","15104","05107","15106","68001","54109","76109","15109","23079","63111","70110","19110","52110","76113","76111","05113","15114","25120","68121","50124","94886","05120","25123","54128","54125","05125","76122","70124","73124","19130","25126","13140","95015","63130","05129","15131","19137","68132","76126","76001","19142","05134","08137","41132","15135","23090","08141","76130","13160","27135","05138","25148","68147","25151","05142","05145","68152","05147","73148","25154","05148","27150","05150","18150","13001","76147","97161","73152","50150","05154","68160","23162","15162","68162","47161","27160","52240","25168","70230","85015","73168","68167","68169","25175","05172","23168","68176","20175","54172","15172","17174","23182","25178","68179","15176","15232","20178","15180","15183","54174","15185","15187","47170","15236","25181","25183","13188","23189","47189","15189","68190","63190","05190","05101","13222","05197","73200","25200","41206","52203","86219","70204","15204","05206","68207","05209","47205","27205","68209","52207","52210","68211","54206","05212","15212","13212","52215","63212","19212","68217","70215","15215","25214","23300","15218","70221","73217","81220","52224","15223","50223","15224","25224","54001","54223","15226","50226","99773","52227","52233","73226","68229","18205","20228","05234","76233","44090","44098","73236","05237","66170","15238","54239","05240","76243","05250","47245","76246","50245","27245","13244","68235","54245","50251","76248","52250","15244","25245","20238","18247","50270","76250","91263","15248","68245","13248","27250","44110","20250","18256","52254","13268","25258","68250","47258","68255","47268","95025","70233","25260","52256","52258","19256","52260","54250","54261","41244","68264","68266","05264","05266","73268","25269","73270","17272","63272","15272","73275","18001","19290","15276","68271","68276","76275","25279","44279","81300","25281","52520","05282","73283","05284","50287","47288","52287","25286","25288","25290","25293","25295","15293","25297","68296","08296","70235","25299","20295","68298","15296","15299","41298","63302","41306","76306","05306","05308","25307","68307","05310","20310","54313","05313","25312","50313","15317","76318","68318","19300","25317","52317","05315","41319","68320","25320","52320","52323","47318","50318","73319","19318","68322","70265","05318","25322","05321","25324","25326","15322","66318","68324","25328","25335","15325","68327","15332","25339","54344","13300","85125","44378","68344","05347","54347","73347","05353","41349","73349","73001","73352","52352","52354","94001","19355","52356","41357","41359","05360","27361","05361","15362","19364","76364","05364","15367","05368","15368","25368","68368","68370","08372","25372","27372","23350","41378","68377","25377","15380","05376","66383","91405","52378","76377","17380","54385","05380","52381","20383","94885","20400","44420","52385","50350","17388","25386","18410","25394","20621","68397","91407","25398","05390","41396","54398","99524","85136","19392","63401","52390","05400","52399","70400","76400","50370","15403","19397","25402","91430","15401","76403","66400","54377","15377","68385","68406","86573","52405","50400","25407","73408","91001","73411","05411","52411","27413","19418","23417","52418","23419","70418","54405","68418","54418","08421","15425","68425","05425","25426","25430","13430","52427","13433","44430","70429","68432","08433","52435","08436","20443","44560","85139","17001","25436","17433","94663","50325","13440","13442","05440","15442","73443","17442","17444","66440","17446","68444","05001","25438","27425","27430","27450","73449","19450","50330","18460","15455","95200","19455","91460","66456","97001","86001","68464","68468","23464","13468","15464","15466","15469","05467","13458","23466","63470","23001","85162","23500","13473","19473","18479","94888","70473","25473","52473","15476","73461","05475","05480","54480","15480","05483","25483","52480","41483","73483","05495","05490","17486","41001","25486","25488","25489","15491","25491","17495","13490","27491","47460","15494","85225","27495","76497","68498","54498","68500","15500","52490","05501","68502","41503","86320","85230","73504","52506","15507","70508","15511","25513","97511","17513","19513","15514","19517","41518","20517","25518","15516","15518","41524","17524","41530","08520","68522","68524","76520","70523","73520","54518","54520","94887","25524","15522","97777","68533","25530","25535","52001","19532","15531","15533","85250","15537","47541","20550","17541","05541","05543","66001","15542","19533","68547","73547","19548","63548","47545","68549","13549","08549","15550","41548","41551","47551","73555","23555","47555","52540","08558","08560","19001","85263","52560","76563","73563","88564","52565","20570","23570","66572","05576","47570","68572","52573","91530","91536","86568","05579","15572","86569","99001","08573","94884","50450","23574","50568","86571","23580","50577","50573","05585","91540","68573","18592","50590","81591","25572","91669","54553","19573","05591","68575","25580","52585","19585","73585","23586","25592","25594","27001","63594","66594","15580","25596","54599","15599","15600","85279","13580","05604","47605","08606","50606","76606","05607","25612","52612","20614","27580","27600","13600","73616","76616","44001","05615","68615","17614","27615","17616","41615","52621","76622","73622","15621","19622","73624","68655","08634","05628","08638","85300","47660","05631","15632","85315","15638","23660","41660","17653","47675","54660","73671","63690","05642","15646","17662","52678","70670","41668","20710","23670","05647","88001","68669","23672","25645","73675","70678","68673","23675","25649","52685","54670","50680","05649","23678","25653","54673","13620","20750","15660","13647","94883","13650","05652","25658","86755","68679","13655","13654","05656","68682","05658","68684","15664","23682","18610","95001","27660","17665","70702","50683","25662","05659","44650","13657","50686","52687","15667","85325","05660","73678","70708","13667","20770","50689","15673","15676","86757","68686","70713","15681","13670","52693","52694","05665","05664","70717","76670","23686","05667","05670","15693","47692","19693","68689","18753","05674","47703","52683","47707","47720","05679","52696","68705","13673","68720","73686","08675","15690","41676","47001","66682","05686","13688","13683","19701","99624","15696","52699","05042","15686","19698","70820","54680","86760","05690","08685","05697","66687","52720","81736","54720","25718","15720","15723","05736","25736","76736","15740","25740","86749","54743","25743","19743","68745","25745","13744","70001","70742","27745","47745","25754","15753","15757","68755","15755","15759","18756","08758","18785","15761","05756","05761","13760","25758","15762","15764","15763","19760","68770","08770","19780","73770","41770","25769","19785","68773","70771","25772","25777","17777","68780","15774","25779","15776","25781","15778","25785","27787","13780","20787","85400","81794","05789","52786","52788","97666","91798","05790","41791","05792","15790","85410","25793","41799","25797","47798","25799","15798","54800","41801","41797","25805","15804","15806","25807","54810","23807","41807","19807","19809","15808","15810","13810","05809","15814","25815","25817","15816","05819","54820","70823","68820","15820","25823","19821","76823","15822","19824","85430","76828","08832","23815","76834","52835","15001","15832","52838","13836","13838","05837","15835","15837","15839","25839","25841","25843","76845","15842","25845","27800","27810","05842","44847","05847","44855","08849","25851","05854","23855","68855","73854","86865","20001","05856","18860","05858","68861","73861","05861","25506","15861","25862","76863","68867","25867","17867","05873","76869","54871","15407","54874","19845","86885","25871","73870","17873","13873","85440","44874","68872","25873","73873","50001","41872","25875","25878","15879","50711","17877","25885","52885","41885","05885","05887","97889","05890","05893","85001","76890","76892","13894","68895","47960","05895","76895","15897","25898","25899","47980"));
	 List<String> Entidades = new ArrayList<String>(Arrays.asList("0101","0123","0102","0149"));
	 List<String> EstadoClientes = new ArrayList<String>(Arrays.asList("1","2"));
	 List<String> EstadosContratos = new ArrayList<String>(Arrays.asList("1","2","3","4"));
	 List<String> Franquicias = new ArrayList<String>(Arrays.asList("1","2","3","4","5"));
	 List<String> FuentesRecursos = new ArrayList<String>(Arrays.asList("2","3","5","6","7","8","10","11","13","15"));
	 List<String> GruposLineasCtif = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25"));
	 List<String> GruposSectoresEconomicos = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"));
	 List<String> ModalidadesReestructuraciones = new ArrayList<String>(Arrays.asList("2","3","5","6","7","8"));
	 List<List<String>> Legados = new ArrayList<List<String>>();{Legados.add(0,Arrays.asList("ALS","SIS","FD","AGE","AG2","AG3","SCE","HPV","RM","CRM","CDO"));Legados.add(1,Arrays.asList("102","107","161","185","166","109","FD","095","059"));Legados.add(2,Arrays.asList("NV","LB","LE","CE","CH","FD","ME","CT","SO"));Legados.add(3,Arrays.asList("KI","AH","KC","TC","FD","KF","KK","KV","KW","KY","MA"));}; 
	 List<String> Monedas = new ArrayList<String>(Arrays.asList("COP","AOA","AON","ADP","AED","AFA","AFN","ALL","AMD","ANG","AOR","ARS","ATS","AUD","AWG","AZM","BAM","BBD","BDT","BEF","BGN","BHD","BIF","BMD","BND","BOB","BRL","BSD","BTN","BWP","BYB","BYR","BZD","CAD","CDF","XPF","CHF","CLP","CNY","CRC","CSD","CUP","CVE","CYP","CZK","DEM","DJF","DKK","DOP","DZD","ECS","EEK","EGP","ERN","ESP","ETB","EUR","FIM","FJD","FKP","FRF","GBP","GEL","GHC","GIP","GMD","GNF","GRD","GTQ","GWP","GYD","HKD","HNL","HRK","HTG","HUF","IDR","IEP","ILS","INR","IQD","IRR","ISK","ITL","JMD","JOD","JPY","KES","KGS","KHR","KMF","KPW","KRW","KWD","KYD","KZT","LAK","LBP","LKR","LRD","LSL","LTL","LUF","LVL","LYD","MAD","MDL","MGA","MGF","MKD","MMK","MNT","MOP","MRO","MTL","MUR","MVR","MWK","MXN","MYR","MZM","NAD","NGN","NIO","NLG","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PTE","PYG","QAR","CNY","ROL","RUB","RWF","SAR","SBD","SCR","SDD","SDP","SEK","SGD","SHP","SIT","SKK","SLL","SOS","SRD","SRG","STD","SVC","SYP","SZL","THB","TJR","TJS","TMM","TND","TOP","TPE","TRL","TRY","TTD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VEB","VEF","VND","VUV","WST","XAF","XCD","XEU","XOF","XPF","YER","YUM","ZAR","ZMK","ZRN","ZWD","UVR","EU4","RON","CLP","CLP"));
	 List<String> NaturalezaJuridicaClientes = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","14","15","16","99"));
	 List<String> Paises = new ArrayList<String>(Arrays.asList("AF","AX","AL","DE","AD","AO","AI","AQ","AG","AN","SA","DZ","AR","AM","AW","AU","AT","AZ","BS","BH","BD","BB","BY","BE","BZ","BJ","BM","BT","BO","BA","BW","BV","BR","BN","BG","BF","BI","CV","KY","KH","CM","CA","CF","TD","CZ","CL","CN","CY","CC","CO","KM","CG","CD","CK","KP","KR","CI","CR","HR","CU","DK","DM","DO","EC","EG","SV","AE","ER","SK","SI","ES","EA","US","UM","EE","ET","FO","PH","FI","FJ","FR","GA","GM","GE","GS","GH","GI","GD","GR","GL","GP","GU","GT","GF","GG","GN","GQ","GW","GY","HT","HM","HN","HK","HU","IN","ID","IR","IQ","IE","IS","IL","IT","JM","JP","JE","JO","KZ","KE","KG","KI","KW","LA","LS","LV","LB","LR","LY","LI","LT","LU","MO","MK","MG","MY","MW","MV","ML","MT","FK","IM","MP","MA","MH","MQ","MU","MR","YT","MX","FM","MD","MC","MN","ME","MS","MZ","MM","NA","NR","CX","NP","NI","NE","NG","NU","NF","NO","NC","NZ","OM","NL","PK","PW","PS","PA","PG","PY","PE","PN","PF","PL","PT","PR","QA","GB","RE","RW","RO","RU","EH","SB","WS","AS","KN","SM","PM","VC","SH","LC","ST","SN","RS","SC","SL","SG","SY","SO","LK","SZ","ZA","SD","SE","CH","SR","SJ","TH","TW","TZ","TJ","IO","TF","TL","TG","TK","TO","TT","TN","TC","TM","TR","TV","UA","UG","EU","UY","UZ","VU","VA","VE","VN","VG","VI","WF","YE","DJ","ZM","ZW"));
	 List<String> ProductosPortafoliosAval = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"));
	 List<String> PortafoliosPucColgaap = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53"));
	 List<List<String>> SegmentosComercialesClientes = new ArrayList<List<String>>();{SegmentosComercialesClientes.add(0,Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61"));SegmentosComercialesClientes.add(1,Arrays.asList("1","2","3","4","5","6","7","8","9"));SegmentosComercialesClientes.add(2,Arrays.asList("05","06","11","12","13","14","15","18","19","20","21","22","23"));SegmentosComercialesClientes.add(3,Arrays.asList("010101","020217","020218","020219","030301","101001","101002","111101","111102","121201","131301","141401","151501"));};
	 List<String> SituacionesClientes = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60","61","62","63","64","65","66","67","68","69","70"));
	 List<String> SituacionesContratos = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51"));
	 List<String> TiposBienes = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6"));
	 List<String> TiposCarteras = new ArrayList<String>(Arrays.asList("A","P","M"));
	 List<String> TiposEmpleados = new ArrayList<String>(Arrays.asList("1","2","3"));
	 List<String> TiposConceptos = new ArrayList<String>(Arrays.asList("CNN_CTE","CNN_CTE_OPCC","CNN_EXT_ANT","CNN_NCTE","CNN_NCTE_OPCC","CNN_PAG_ANT","D_PLAZO","E_PLAZO","K","K_ANT","K_BXC","K_CO","K_CRM","K_CRM_CTG","K_CRM_EXT","K_CRM_EXT_VIS_EX_CTG","K_CRM_VIS_EXEN","K_CTGIA","K_DESC","K_IMP","K_PAS","K_PAS_DIF","K_PRIM_X_AMORT","K_REEX","P_DIFER","CM_TC","COM_FNG","COM_OTRAS","COM_PME","COM_PML","COM_SERV_BANC","COM_TC","GMF_CH_GER","GMF_CTA_PROVED","GMF_DESMB","GMF_SAL_AFAVOR","ICA_RET_MUNIC","IVA","IVA_DESC","IVA_DESC_COM","IVA_DESC_SERV","IVA_SERV_BANC","RET_COM","RET_COMP_NAL","RET_CONT_CONST","RET_HON","RET_VIG_ANT","RETEIVA","TIMBRE","TIMBRE_TR","TRIB_ADUAN","DIV_OTRAS","EXC_CREDITO","FAGR","FANT","FNG","FOGAF_CXP","GASTOS_JUD","HON","HON_CC","HON_EXT","IFRECH_VENC","SOB_CREDITOS","SOB_LIBRANZAS","TITUL_CAR_PROD","EXC_CUOTA","SAF_FAV_TC","SOB_CANCEL","SEG_CTA_IND","SEG_DESEMP","SEG_EMP","SEG_INC_TERR","SEG_OT","SEG_OT_LEA","SEG_TRIESGO_CONST","SEG_TRIESGO_VEHI","SEG_VID_RIEG_VEH","SEG_VIDA_DEUD","SEG_VIDA_LEA","SEG_VIDA_VEH","SEG_VIDA_VIV","CM_TC_ANT","CM_TC_DE","COBRO_JUR","COM_ADM_CRED","COM_ADM_MICROF","COM_ADM_ROT","COM_AV_TC","COM_COB","COM_COB_EXP","COM_COB_IMP","COM_END_EXT","COM_GIRO_FIN_IMP","COM_GIRO_FIN_OT","COM_GIROS","COM_OP_EXPORT","COM_PREPAG","COM_PRORROG","COM_REC_PRIMA_SEG","COM_TRANSF_REC","HON_AVALUOS","HON_EST_TITULOS","HON_JURID","HON_LIND","HON_VISI_OBRA","I_CRM_SOB_CUO","PAP","PORTES","SAF_MEN_CR","SAF_MEN_DB","SANC_CH_DEV","ICMF","ICMF_SANC_CTG","ICTE","ICTE_CTG","ICTE_MORA","ICTE_MORA_CTG","ICTE_PAS","ICTE_RXA","ICTE_RXA_PAS","ICTE_VIS","ICTE_VIS_EXEN","ICTE_VIS_EXT_EXEN","IFRECH","IMORA","IMORA_CTG","IMORA_VIS","IPSV_DIF","IREES","ISANC","ISANC_CTG","ISUB","ABONO","CUPO ","CUPO ","FOGAF_CXC","REC","SAF_MEN_FAV","CXC_PROV","CXC_PROV_CC","I_PROV","I_PROV_CC","K_PROV","K_PROV_CC","SEG_PROV","GST_MOBIL"));
	 List<String> TiposTransacciones = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34"));
	 List<String> TiposDinamicas = new ArrayList<String>(Arrays.asList("EST","CAS","DIR","ALT","PME","CDO"));
	 List<String> TiposGarantias = new ArrayList<String>(Arrays.asList("I","O"));
	 List<String> TiposIdentificaciones = new ArrayList<String>(Arrays.asList("8","11","12","13","14","15","21","22","31","33","41","42","43","44","46"));
	 List<String> TiposLeasings = new ArrayList<String>(Arrays.asList("O","H","F"));
	 List<String> TiposPuntos = new ArrayList<String>(Arrays.asList("N","E"));
	 List<String> TiposTasas = new ArrayList<String>(Arrays.asList("NOM","DTF","IBR030","IPC","LIB030","LIB060","LIB090","LIB120","LIB150","LIB180","LIB210","LIB240","LIB270","LIB300","LIB330","LIB360","PRI","LIB007","EUR007","EUR030","EUR060","EUR090","EUR120","EUR150","EUR180","EUR270","EUR360","IBR090"));
	 List<String> TiposViviendasHipotecarios = new ArrayList<String>(Arrays.asList("1","2","3","4"));
	 
	 public String getCod_TipoViviendaHipotecario() {
			return TiposViviendasHipotecarios.get(0 + rnd.nextInt(TiposViviendasHipotecarios.size()));		
	}
	 public String getCod_Tipotasa() {
			return TiposTasas.get(0 + rnd.nextInt(TiposTasas.size()));		
	}
	 public String getCod_TipoPunto() {
			return TiposPuntos.get(0 + rnd.nextInt(TiposPuntos.size()));		
	}
	 public String getCod_TipoLeasing() {
			return TiposLeasings.get(0 + rnd.nextInt(TiposLeasings.size()));		
	}
	 public String getCod_TipoIdentificacion() {
			return TiposIdentificaciones.get(0 + rnd.nextInt(TiposIdentificaciones.size()));		
	}
	 public String getCod_TipoGarantia() {
			return TiposGarantias.get(0 + rnd.nextInt(TiposGarantias.size()));		
	}
	 public String getCod_TipoDinamica() {
			return TiposDinamicas.get(0 + rnd.nextInt(TiposDinamicas.size()));		
	}
	 public String getCod_TipoTransaccion() {
			return TiposTransacciones.get(0 + rnd.nextInt(TiposTransacciones.size()));		
	}
	 public String getCod_TipoConcepto() {
			return TiposConceptos.get(0 + rnd.nextInt(TiposConceptos.size()));		
	}
	 public String getCod_TipoEmpleado() {
			return TiposEmpleados.get(0 + rnd.nextInt(TiposEmpleados.size()));		
	}
	 public String getCod_TipoCartera() {
			return TiposCarteras.get(0 + rnd.nextInt(TiposCarteras.size()));		
	}
	 public String getCod_TipoBien() {
			return TiposBienes.get(0 + rnd.nextInt(TiposBienes.size()));		
	}
	 public String getCod_SituacionContrato() {
			return SituacionesContratos.get(0 + rnd.nextInt(SituacionesContratos.size()));		
	}
	 public String getCod_SituacionCliente() {
			return SituacionesClientes.get(0 + rnd.nextInt(SituacionesClientes.size()));		
	}
	 public String getCod_SegmentoComercialCliente(String a) {
		 	int j=0;
		    for (int i = 0; i <= Entidades.size()-1; i++) {
		    	if (Entidades.get(i) == a){
		    		 j = i;
		    	}
		    }	
		    return SegmentosComercialesClientes.get(j).get(0 + rnd.nextInt(SegmentosComercialesClientes.get(j).size()));
	 }
	 public String getCod_PortafolioPucColgaap() {
			return PortafoliosPucColgaap.get(0 + rnd.nextInt(PortafoliosPucColgaap.size()));		
	}
	 public String getCod_ProductoPortafolioAval() {
			return ProductosPortafoliosAval.get(0 + rnd.nextInt(ProductosPortafoliosAval.size()));		
				 
			}
	 public String getCod_Pais() {
			return Paises.get(0 + rnd.nextInt(Paises.size()));		
				 
			}
	 public String getCod_NaturalezaJuridicaCliente() {
			return NaturalezaJuridicaClientes.get(0 + rnd.nextInt(NaturalezaJuridicaClientes.size()));		
				 
			}
	 public String getCod_Moneda() {
			return Monedas.get(0 + rnd.nextInt(Monedas.size()));		
				 
			}
	   public String getCod_Legado(String a) {
		 	int j=0;
		    for (int i = 0; i <= Entidades.size()-1; i++) {
		    	if (Entidades.get(i) == a) {
		    		 j = i;
		    	}
		    }		    
		    return Legados.get(j).get(0 + rnd.nextInt(Legados.get(j).size()));	 
			} 
	 
	public String getCod_ModalidadReestructuracion() {
	return ModalidadesReestructuraciones.get(0 + rnd.nextInt(ModalidadesReestructuraciones.size()));		
		 
	}
	 public String getCod_GrupoSectorEconomico() {
		 return GruposSectoresEconomicos.get(0 + rnd.nextInt(GruposSectoresEconomicos.size()));		 
	}
	 public String getCod_GrupoLineaCtif() {
		 return GruposLineasCtif.get(0 + rnd.nextInt(GruposLineasCtif.size()));		 
	}
	 public String getCod_FuenteRecurso() {
		 return FuentesRecursos.get(0 + rnd.nextInt(FuentesRecursos.size()));		 
	}
	 public String getCod_Franquicia() {
		 return Franquicias.get(0 + rnd.nextInt(Franquicias.size()));		 
	}
	 public String getCod_EstadoContrato() {
		 return EstadosContratos.get(0 + rnd.nextInt(EstadosContratos.size()));		 
	}
	 public String getCod_calificacion() {
		 return Calificacion.get(0 + rnd.nextInt(Calificacion.size()));		 
	}
	 public String getCod_CategoriaValorizacion() {
		 return CategoriaValorizacion.get(0 + (rnd.nextInt(CategoriaValorizacion.size())));		 
	}
	 public String getCod_Ciiu() {
		 return Ciiu.get(0 + (rnd.nextInt(Ciiu.size())));		 
	}
	 public String getCod_ClasesCarteras() {
		 return ClasesCarteras.get(0 + (rnd.nextInt(ClasesCarteras.size())));		 
	} 
	 public String getCod_Dane() {
		 return Dane.get(0 + (rnd.nextInt(Dane.size())));		 
	} 
	 public String getCod_Entidad() {
		 return Entidades.get(0 + (rnd.nextInt(Entidades.size())));		 
	} 
	 public String getCod_EstadoCliente() {
		 return EstadoClientes.get(0 + (rnd.nextInt(EstadoClientes.size())));		 
	} 
}