/*
Navicat MySQL Data Transfer

Source Server         : Self
Source Server Version : 50622
Source Host           : 119.90.131.199:3306
Source Database       : hn_ncz

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2015-12-10 16:47:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apoplexy_conclusion_info
-- ----------------------------
DROP TABLE IF EXISTS `apoplexy_conclusion_info`;
CREATE TABLE `apoplexy_conclusion_info` (
  `ApoplexyConclusionID` int(11) NOT NULL AUTO_INCREMENT COMMENT '脑卒中风险评级ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Hypertension` varchar(1) DEFAULT '0' COMMENT '高血压（0：无；1：有）',
  `Dyslipidemia` varchar(1) DEFAULT '0' COMMENT '血脂异常(0:否；1：是)',
  `Diabetes` varchar(1) DEFAULT '0' COMMENT '糖尿病(0:无；1：有）',
  `AtrialFibrillation` varchar(1) DEFAULT '0' COMMENT '房颤或瓣膜性心脏病(0：无；1：有）',
  `SmokingHistory` varchar(1) DEFAULT '0' COMMENT '吸烟史(0：无；1：有）',
  `Overweight` varchar(1) DEFAULT '0' COMMENT '明显超重或肥胖(0：否；1：是)',
  `SportsLack` varchar(1) DEFAULT '0' COMMENT '运动缺乏或轻体力劳动者（0：否；1：是）',
  `FamilyHistory` varchar(1) DEFAULT '0' COMMENT '脑卒中家族史（0：无；1：有）',
  `PastStroke` varchar(1) DEFAULT '0' COMMENT '既往脑卒中（0：无；1：有）',
  `PastTIA` varchar(1) DEFAULT '0' COMMENT '既往短暂性脑缺血发作（0：无；1：有）',
  `Grade` varchar(20) DEFAULT NULL COMMENT '风险等级（ZF）',
  `Mark` varchar(20) DEFAULT NULL COMMENT '危险标识（YE）',
  `ManageLevel` varchar(20) DEFAULT NULL COMMENT '管理分级（Y）',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`ApoplexyConclusionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群评级结论表';

-- ----------------------------
-- Records of apoplexy_conclusion_info
-- ----------------------------

-- ----------------------------
-- Table structure for blood_fat_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `blood_fat_exam_info`;
CREATE TABLE `blood_fat_exam_info` (
  `BloodFatExamID` int(11) NOT NULL AUTO_INCREMENT COMMENT '血脂检查ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `ExamTime` date DEFAULT NULL COMMENT '检查时间',
  `Triglyceride` decimal(6,2) DEFAULT NULL COMMENT '甘油三酯(mmol/L)',
  `Cholesterol` decimal(6,2) DEFAULT NULL COMMENT '胆固醇(mmol/L)',
  `LowCholesterol` decimal(6,2) DEFAULT NULL COMMENT '低密度脂蛋白胆固醇(mmol/L)',
  `HeightCholesterol` decimal(6,2) DEFAULT NULL COMMENT '高密度脂蛋白胆固醇(mmol/L)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`BloodFatExamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群血脂检查表';

-- ----------------------------
-- Records of blood_fat_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for blood_fat_history
-- ----------------------------
DROP TABLE IF EXISTS `blood_fat_history`;
CREATE TABLE `blood_fat_history` (
  `BloodFatHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '血脂病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Frequency` varchar(20) DEFAULT NULL COMMENT '血脂测量频率(ZW)',
  `IsBloodFat` varchar(1) DEFAULT '0' COMMENT '既往有无被诊断为血脂异常(0:无；1：有）',
  `DiagnosisTime` date DEFAULT NULL,
  `HighCholesterol` varchar(1) DEFAULT '0' COMMENT '高胆固醇异常（0：无异常；1：异常）',
  `HighTriglyceride` varchar(1) DEFAULT '0' COMMENT '高甘油三酯异常（0：无异常；1：异常）',
  `HighLDL-C` varchar(1) DEFAULT '0' COMMENT '高LDL-C异常（0：无异常；1：异常）',
  `LowHDL-C` varchar(1) DEFAULT '0' COMMENT '低LDL-C异常（0：无异常；1：异常）',
  `Other` varchar(1) DEFAULT '0' COMMENT '不详（0:不选中；1：选中）',
  `IsLipid-lowering` varchar(1) DEFAULT '0' COMMENT '是否服用调脂药(0:否；1：是）',
  `CholesterolControl` varchar(20) DEFAULT NULL COMMENT '胆固醇控制情况（ZX)',
  `CholesterolYear` varchar(2) DEFAULT NULL COMMENT '胆固醇控制年限',
  `TriglycerideControl` varchar(20) DEFAULT NULL COMMENT '甘油三酯控制情况（ZX)',
  `TriglycerideYear` varchar(2) DEFAULT NULL COMMENT '甘油三酯控制年限',
  `LDL-CControl` varchar(20) DEFAULT NULL COMMENT 'LDL-C控制情况（ZX)',
  `LDL-CYear` varchar(2) DEFAULT NULL COMMENT 'LDL-C控制年限',
  `HDL-CControl` varchar(20) DEFAULT NULL COMMENT 'HDL-C控制情况（ZX)',
  `HDL-CYear` varchar(2) DEFAULT NULL COMMENT 'HDL-C控制年限',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`BloodFatHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群血脂异常病史表';

-- ----------------------------
-- Records of blood_fat_history
-- ----------------------------

-- ----------------------------
-- Table structure for blood_glucose_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `blood_glucose_exam_info`;
CREATE TABLE `blood_glucose_exam_info` (
  `BloodGlucoseExamID` int(11) NOT NULL AUTO_INCREMENT COMMENT ' 血糖检查ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `BloodGlucoseType` varchar(20) DEFAULT NULL COMMENT '血糖类型（YD）',
  `ExamTime` date DEFAULT NULL COMMENT '检查时间',
  `ExamResult` decimal(6,2) DEFAULT NULL COMMENT '检查结果',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`BloodGlucoseExamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群血糖检查表';

-- ----------------------------
-- Records of blood_glucose_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for brain_blood_history
-- ----------------------------
DROP TABLE IF EXISTS `brain_blood_history`;
CREATE TABLE `brain_blood_history` (
  `BrainBloodHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '脑血管病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `IsBrainBlood` varchar(1) DEFAULT '0' COMMENT '脑血管病史(0:无；1：有)',
  `Number` varchar(3) DEFAULT NULL COMMENT '发病次数',
  `LastTime` date DEFAULT NULL COMMENT '末次发病时间',
  `Diagnosis` varchar(20) DEFAULT NULL COMMENT '主要诊断(ZY)',
  `BasisBrainCT` varchar(1) DEFAULT '0' COMMENT '诊断依据脑部CT(0:否；1：是）',
  `BasisBrainMRI` varchar(1) DEFAULT '0' COMMENT '诊断依据脑部MRI(0:否；1：是）',
  `Clinical` varchar(1) DEFAULT '0' COMMENT '诊断依据临床表现(0:否；1：是）',
  `MRSTime` date DEFAULT NULL COMMENT 'MRS评估时间',
  `MRSOption` varchar(20) DEFAULT NULL COMMENT 'MRS选项（ZZ）',
  `MRSValue` varchar(3) DEFAULT NULL COMMENT 'MRS分值',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`BrainBloodHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群脑血管病病史表';

-- ----------------------------
-- Records of brain_blood_history
-- ----------------------------

-- ----------------------------
-- Table structure for depart_status_info
-- ----------------------------
DROP TABLE IF EXISTS `depart_status_info`;
CREATE TABLE `depart_status_info` (
  `InfoID` int(11) NOT NULL AUTO_INCREMENT,
  `depBM` varchar(20) DEFAULT NULL,
  `Status` varchar(20) DEFAULT NULL COMMENT '数据来自于sm_codeitem的code字段，codeid值为ZA',
  `CreateDate` datetime DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`InfoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构状态信息表';

-- ----------------------------
-- Records of depart_status_info
-- ----------------------------

-- ----------------------------
-- Table structure for diabetes_history
-- ----------------------------
DROP TABLE IF EXISTS `diabetes_history`;
CREATE TABLE `diabetes_history` (
  `DiabetesHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '糖尿病病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Frequency` varchar(20) DEFAULT NULL COMMENT '血糖测量频率(ZW)',
  `IsDiabetes` varchar(1) DEFAULT '0' COMMENT '既往有无被诊断为糖尿病(0:无；1：有）',
  `DiagnosisTime` date DEFAULT NULL COMMENT '确诊时间',
  `IsHypoglycemic` varchar(1) DEFAULT '0' COMMENT '是否服降糖药(0:否；1：是）',
  `IsInsulin` varchar(1) DEFAULT '0' COMMENT '是否使用胰岛素(0:否；1：是）',
  `PharmacySituation` varchar(1) DEFAULT '0' COMMENT '胰岛素用药情况(0:规律；1:不规律)',
  `Control` varchar(20) DEFAULT NULL COMMENT '血糖控制情况(ZX)',
  `ControlYeat` varchar(2) DEFAULT NULL COMMENT '此情况已维持年限',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`DiabetesHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群糖尿病病史表';

-- ----------------------------
-- Records of diabetes_history
-- ----------------------------

-- ----------------------------
-- Table structure for electrocardiogram_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `electrocardiogram_exam_info`;
CREATE TABLE `electrocardiogram_exam_info` (
  `ElectrocardiogramExanID` int(11) NOT NULL AUTO_INCREMENT COMMENT '心电图检查ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `ExamTime` date DEFAULT NULL COMMENT '检查时间',
  `ExamMan` varchar(30) DEFAULT NULL COMMENT '检查人',
  `ExamResult` varchar(1) DEFAULT '0' COMMENT '检查结果（0：正常；1：异常）',
  `ExceptionType` varchar(20) DEFAULT NULL COMMENT '异常类型(YC)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`ElectrocardiogramExanID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群心电图检查表';

-- ----------------------------
-- Records of electrocardiogram_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for heart_disease_history
-- ----------------------------
DROP TABLE IF EXISTS `heart_disease_history`;
CREATE TABLE `heart_disease_history` (
  `HeartDiseaseHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '心脏病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `IsHeartDisease` varchar(1) DEFAULT '0' COMMENT '心脏病史(0:无；1：有)',
  `CoronaryDisease` varchar(1) DEFAULT '0' COMMENT '冠心病（0：无；1：有）',
  `AtrialFibrillation` varchar(1) DEFAULT '0' COMMENT '房颤（0：无；1：有）',
  `VHD` varchar(1) DEFAULT '0' COMMENT '瓣膜性心脏病（0：无；1：有）',
  `Other` varchar(1) DEFAULT '0' COMMENT '其他（0：无；1：有）',
  `Number` varchar(3) DEFAULT NULL COMMENT '冠心病发病次数',
  `LastTime` date DEFAULT NULL COMMENT '冠心病末次发病时间',
  `Diagnosis` varchar(20) DEFAULT NULL COMMENT '主要诊断(YA)',
  `BasisMyocardialEnzymes` varchar(1) DEFAULT '0' COMMENT '诊断依据-心肌酶升高（0：否；1：是）',
  `BasisECG` varchar(1) DEFAULT '0' COMMENT '诊断依据-心电图异常（0：否；1：是）',
  `BasisCoronaryAngiography` varchar(1) DEFAULT '0' COMMENT '诊断依据-冠脉造影（0：否；1：是）',
  `Clinical` varchar(1) DEFAULT '0' COMMENT '诊断依据-临床表现(0:否；1：是）',
  `FirstTime` date DEFAULT NULL COMMENT '房颤首次确诊时间',
  `IsPlatelet` varchar(1) DEFAULT '0' COMMENT '是否服用抗血小板药物(0:否；1：是)',
  `IsAnticoagulant` varchar(1) DEFAULT '0' COMMENT '是否服用抗凝药物(0:否；1：是)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`HeartDiseaseHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群心脏病病史表';

-- ----------------------------
-- Records of heart_disease_history
-- ----------------------------

-- ----------------------------
-- Table structure for history_pharmacy
-- ----------------------------
DROP TABLE IF EXISTS `history_pharmacy`;
CREATE TABLE `history_pharmacy` (
  `PharmacyID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用药ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `PharmacyType` varchar(20) DEFAULT NULL COMMENT '用药类型（ZU--前2位）',
  `PharmacyName` varchar(20) DEFAULT NULL COMMENT '用药名称（ZU--4或6位）',
  `PharmacyYear` varchar(2) DEFAULT NULL COMMENT '用药年限',
  `PharmacySituation` varchar(1) DEFAULT '0' COMMENT '用药情况(0:规律；1:不规律)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`PharmacyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群用药病史表';

-- ----------------------------
-- Records of history_pharmacy
-- ----------------------------

-- ----------------------------
-- Table structure for homocysteine_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `homocysteine_exam_info`;
CREATE TABLE `homocysteine_exam_info` (
  `HomocysteineExamID` int(11) NOT NULL AUTO_INCREMENT COMMENT '同型半胱氨酸检查ID',
  `CrowdID` int(11) DEFAULT NULL,
  `ExamTime` date DEFAULT NULL,
  `Homocysteine` decimal(6,2) DEFAULT NULL COMMENT '同型半胱氨酸(μmol/L)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`HomocysteineExamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群同型半胱氨酸检查表';

-- ----------------------------
-- Records of homocysteine_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for hypertension_history
-- ----------------------------
DROP TABLE IF EXISTS `hypertension_history`;
CREATE TABLE `hypertension_history` (
  `HypertensionHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '高血压病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Frequency` varchar(20) DEFAULT NULL COMMENT '血压测量频率(ZS)',
  `IsHypertension` varchar(1) DEFAULT '0' COMMENT '既往有无被诊断为高血压(0:无；1：有）',
  `DiagnosisTime` date DEFAULT NULL COMMENT '确诊时间',
  `IsHypotensor` varchar(1) DEFAULT '0' COMMENT '是否服用降压药(0:否；1：是)',
  `IsCysteine` varchar(1) DEFAULT '0' COMMENT '是否服用降同型半胱氨酸药(0:否；1：是)',
  `Control` varchar(20) DEFAULT NULL COMMENT '血压控制情况(ZT)',
  `ControlYear` varchar(2) DEFAULT NULL COMMENT '此情况已维持年限',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`HypertensionHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群高血压病史表';

-- ----------------------------
-- Records of hypertension_history
-- ----------------------------

-- ----------------------------
-- Table structure for institution_crowd_base_info
-- ----------------------------
DROP TABLE IF EXISTS `institution_crowd_base_info`;
CREATE TABLE `institution_crowd_base_info` (
  `CrowdID` int(11) NOT NULL AUTO_INCREMENT COMMENT '人群ID',
  `CertificatesType` varchar(20) DEFAULT NULL COMMENT '证件类型（数据来源于CODEITEM的ZD)',
  `CertificatesID` varchar(50) DEFAULT NULL COMMENT '证件号码',
  `FullName` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Mobile` varchar(50) DEFAULT NULL COMMENT '手机号',
  `Sex` varchar(1) DEFAULT NULL COMMENT '性别（0：女；1：男；2：不定）',
  `BirthDate` date DEFAULT NULL COMMENT '出生日期',
  `depBM` varchar(20) DEFAULT NULL COMMENT '创建机构（不显示，过滤人群的条件），注意不是科室代码',
  `CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `UserName` varchar(50) DEFAULT NULL COMMENT '创建人',
  `States` varchar(20) DEFAULT NULL COMMENT '病例状态（数据来源于ZE)',
  `Grade` varchar(20) DEFAULT NULL COMMENT '风险等级（ZF)',
  `Source` varchar(20) DEFAULT NULL COMMENT '数据来源(ZG)',
  `SourceBZ` varchar(100) DEFAULT NULL COMMENT '来源机构（备注说明）',
  `CaseNo` varchar(50) DEFAULT NULL COMMENT '病例编号',
  `Nation` varchar(20) DEFAULT NULL COMMENT '民族（ZH）',
  `Education` varchar(20) DEFAULT NULL COMMENT '受教育程度（ZI）',
  `Occupation` varchar(20) DEFAULT NULL COMMENT '职业（ZJ）',
  `Income` varchar(20) DEFAULT NULL COMMENT '本人年均收入（ZK）',
  `Pay` varchar(20) DEFAULT NULL COMMENT '主要医疗付费方式（ZL）',
  `CensusRegisterAddress` varchar(100) DEFAULT NULL COMMENT '户籍地址',
  `CensusRegisterCode` varchar(6) DEFAULT NULL COMMENT '户籍邮编',
  `LiveAddress` varchar(100) DEFAULT NULL COMMENT '现居住地址',
  `LiveCode` varchar(6) DEFAULT NULL COMMENT '现居住地址邮编',
  `Tel` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `Email` varchar(50) DEFAULT NULL COMMENT '电子邮箱',
  `LinkMan` varchar(50) DEFAULT NULL COMMENT '主要联系人姓名',
  `LinkManMob` varchar(30) DEFAULT NULL COMMENT '主要联系人手机',
  `Relationship` varchar(20) DEFAULT NULL COMMENT '与本人关系（ZM)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`CrowdID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构人群基本信息表';

-- ----------------------------
-- Records of institution_crowd_base_info
-- ----------------------------

-- ----------------------------
-- Table structure for institution_crowd_family_info
-- ----------------------------
DROP TABLE IF EXISTS `institution_crowd_family_info`;
CREATE TABLE `institution_crowd_family_info` (
  `FamilyID` int(11) NOT NULL AUTO_INCREMENT COMMENT '家族史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `DiseaseType` varchar(20) DEFAULT NULL COMMENT '病种类型（ZR）',
  `IsExist` varchar(1) DEFAULT '0' COMMENT '是否存在（0：无；1：有；2：不详）',
  `Father` varchar(1) DEFAULT '0' COMMENT '父亲（0：无；1:有）',
  `Mother` varchar(1) DEFAULT '0' COMMENT '母亲（0：无；1:有）',
  `BrotherSister` varchar(1) DEFAULT '0' COMMENT '兄弟姐妹（0:无；1:1个；2:2个......）',
  `Children` varchar(1) DEFAULT '0' COMMENT '子女（0:无；1:1个；2:2个......）',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`FamilyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构人群家族史调研表';

-- ----------------------------
-- Records of institution_crowd_family_info
-- ----------------------------

-- ----------------------------
-- Table structure for institution_crowd_lifestyle_info
-- ----------------------------
DROP TABLE IF EXISTS `institution_crowd_lifestyle_info`;
CREATE TABLE `institution_crowd_lifestyle_info` (
  `LifeStyleID` int(11) NOT NULL AUTO_INCREMENT COMMENT '生活方式ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `Smoke` varchar(20) DEFAULT NULL COMMENT '吸烟情况（ZN）',
  `SmokeYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `SmokeDay` varchar(3) DEFAULT NULL COMMENT '每天支数',
  `Wine` varchar(20) DEFAULT NULL COMMENT '喝酒情况（ZO）',
  `WineYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `Sports` varchar(20) DEFAULT NULL COMMENT '运动情况（ZP）',
  `SportsYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `Diet` varchar(20) DEFAULT NULL COMMENT '膳食习惯（ZQ）',
  `DietYear` varchar(2) DEFAULT NULL COMMENT '年限',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`LifeStyleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构人群生活方式表';

-- ----------------------------
-- Records of institution_crowd_lifestyle_info
-- ----------------------------

-- ----------------------------
-- Table structure for kidney_disease_hostory
-- ----------------------------
DROP TABLE IF EXISTS `kidney_disease_hostory`;
CREATE TABLE `kidney_disease_hostory` (
  `KidneyDiseaseHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '肾脏疾病病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `IsKidneyDisease` varchar(1) DEFAULT '0' COMMENT '既往有无被诊断为肾脏疾病(0:无；1：有)',
  `DiagnosisTime` date DEFAULT NULL COMMENT '确诊时间',
  `Diabetes` varchar(1) DEFAULT '0' COMMENT '肾脏疾病类型-糖尿病肾病(0:否；1：是)',
  `Hypertension` varchar(1) DEFAULT '0' COMMENT '肾脏疾病类型-高血压肾病(0:否；1：是)',
  `RenalFailure` varchar(1) DEFAULT '0' COMMENT '肾脏疾病类型-肾功能衰竭(0:否；1：是)',
  `AcuteNephritis` varchar(1) DEFAULT '0' COMMENT '肾脏疾病类型-急性肾炎(0:否；1：是)',
  `ChronicNephritis` varchar(1) DEFAULT '0' COMMENT '肾脏疾病类型-慢性肾炎(0:否；1：是)',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`KidneyDiseaseHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群肾脏病病史表';

-- ----------------------------
-- Records of kidney_disease_hostory
-- ----------------------------

-- ----------------------------
-- Table structure for other_history
-- ----------------------------
DROP TABLE IF EXISTS `other_history`;
CREATE TABLE `other_history` (
  `OtherID` int(11) NOT NULL AUTO_INCREMENT COMMENT '其他病历ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `OtherType` varchar(20) DEFAULT NULL COMMENT '其他病类型（YB)',
  `IsOther` varchar(1) DEFAULT '0' COMMENT '是否有既往病历（0：否；1：是）',
  `DiagnosisTime` date DEFAULT NULL COMMENT '确诊时间',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`OtherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群其他同指标疾病病史表';

-- ----------------------------
-- Records of other_history
-- ----------------------------

-- ----------------------------
-- Table structure for physique_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `physique_exam_info`;
CREATE TABLE `physique_exam_info` (
  `PhysiqueExamID` int(11) NOT NULL AUTO_INCREMENT COMMENT '体格检查ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `ExamTime` date DEFAULT NULL COMMENT '检查时间',
  `Height` decimal(6,2) DEFAULT NULL COMMENT '身高(cm)',
  `Weight` decimal(6,2) DEFAULT NULL COMMENT '体重(kg)',
  `BMI` decimal(6,2) DEFAULT NULL COMMENT '根据高和体重自动生成（kg/m2）',
  `Waist` decimal(6,2) DEFAULT NULL COMMENT '腰围',
  `OneSBP` decimal(6,2) DEFAULT NULL COMMENT '第一次，收缩压SBP(mmHg)',
  `OneDBP` decimal(6,2) DEFAULT NULL COMMENT '第一次，舒张压SBP(mmHg)',
  `OnePulse` int(3) DEFAULT NULL COMMENT '第一次脉搏(次/分)',
  `TwoSBP` decimal(6,2) DEFAULT NULL,
  `TwoDBP` decimal(6,2) DEFAULT NULL,
  `TwoPulse` int(3) DEFAULT NULL,
  `CardiacSouffle` varchar(1) DEFAULT '0' COMMENT '心脏杂音(0:无；1：有)',
  `Rhythm` varchar(1) DEFAULT '0' COMMENT '心律(0:整齐；1：不齐）',
  `Flag` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`PhysiqueExamID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群体格检查表';

-- ----------------------------
-- Records of physique_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for pulmonary_disease_history
-- ----------------------------
DROP TABLE IF EXISTS `pulmonary_disease_history`;
CREATE TABLE `pulmonary_disease_history` (
  `PulmonaryDiseaseHistoryID` int(11) NOT NULL AUTO_INCREMENT COMMENT '肺源性疾病病史ID',
  `CrowdID` int(11) DEFAULT NULL COMMENT '人群ID',
  `IsPulmonaryDisease` varchar(1) DEFAULT '0' COMMENT '既往有无被诊断为肺源性疾病(0:无；1：有）',
  `DiagnosisTime` date DEFAULT NULL COMMENT '确诊时间',
  `Slow` varchar(1) DEFAULT '0' COMMENT '肺源性疾病类型-慢阻肺(0:无；1：有)',
  `TurtleLung` varchar(1) DEFAULT '0' COMMENT '肺源性疾病类型-支气管扩张(0:无；1：有)',
  `Tuberculosis` varchar(1) DEFAULT '0' COMMENT '肺源性疾病类型-肺结核(0:无；1：有)',
  `LungTumor` varchar(1) DEFAULT '0' COMMENT '肺源性疾病类型-肺肿瘤(0:无；1：有)',
  `PulmonaryEmbolism` varchar(1) DEFAULT '0' COMMENT '肺源性疾病类型-肺栓塞(0:无；1：有)',
  `FLAG` varchar(10) DEFAULT NULL COMMENT '预留标示',
  PRIMARY KEY (`PulmonaryDiseaseHistoryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人群肺源性疾病病史表';

-- ----------------------------
-- Records of pulmonary_disease_history
-- ----------------------------

-- ----------------------------
-- Table structure for sm_codecollect
-- ----------------------------
DROP TABLE IF EXISTS `sm_codecollect`;
CREATE TABLE `sm_codecollect` (
  `CodeId` char(2) NOT NULL DEFAULT '',
  `Description` varchar(100) DEFAULT NULL,
  `Length` int(11) DEFAULT NULL,
  PRIMARY KEY (`CodeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典类别表';

-- ----------------------------
-- Records of sm_codecollect
-- ----------------------------
INSERT INTO `sm_codecollect` VALUES ('AB', '行政区划 （GB/T 2260-95）', '6');
INSERT INTO `sm_codecollect` VALUES ('AX', '性别 （GB/T 2261）', '1');
INSERT INTO `sm_codecollect` VALUES ('YA', '心脏病主要诊断', '2');
INSERT INTO `sm_codecollect` VALUES ('YB', '其他同指标疾病', '2');
INSERT INTO `sm_codecollect` VALUES ('YC', '心电图异常类型', '2');
INSERT INTO `sm_codecollect` VALUES ('YD', '检查血糖类型', '2');
INSERT INTO `sm_codecollect` VALUES ('YE', '危险标识', '2');
INSERT INTO `sm_codecollect` VALUES ('YF', '管理分级', '2');
INSERT INTO `sm_codecollect` VALUES ('ZA', '用户类型', '2');
INSERT INTO `sm_codecollect` VALUES ('ZB', '角色权限等级', '2');
INSERT INTO `sm_codecollect` VALUES ('ZC', '机构类型', '2');
INSERT INTO `sm_codecollect` VALUES ('ZD', '证件类型', '2');
INSERT INTO `sm_codecollect` VALUES ('ZE', '病历状态', '2');
INSERT INTO `sm_codecollect` VALUES ('ZF', '风险等级', '2');
INSERT INTO `sm_codecollect` VALUES ('ZG', '数据来源', '2');
INSERT INTO `sm_codecollect` VALUES ('ZH', '民族 （GB/T 3304）', '2');
INSERT INTO `sm_codecollect` VALUES ('ZI', '受教育程度', '2');
INSERT INTO `sm_codecollect` VALUES ('ZJ', '职业', '2');
INSERT INTO `sm_codecollect` VALUES ('ZK', '本人年均收入', '2');
INSERT INTO `sm_codecollect` VALUES ('ZL', '主要医疗付费方式', '2');
INSERT INTO `sm_codecollect` VALUES ('ZM', '与本人关系', '2');
INSERT INTO `sm_codecollect` VALUES ('ZN', '吸烟方式', '4');
INSERT INTO `sm_codecollect` VALUES ('ZO', '饮酒方式', '2');
INSERT INTO `sm_codecollect` VALUES ('ZP', '运动方式', '2');
INSERT INTO `sm_codecollect` VALUES ('ZQ', '膳食方式', '4');
INSERT INTO `sm_codecollect` VALUES ('ZR', '家族史选项', '2');
INSERT INTO `sm_codecollect` VALUES ('ZS', '血压测量频率', '2');
INSERT INTO `sm_codecollect` VALUES ('ZT', '血压控制情况', '2');
INSERT INTO `sm_codecollect` VALUES ('ZU', '用药类型及其药品名称', '6');
INSERT INTO `sm_codecollect` VALUES ('ZW', '血脂血糖测量频率', '2');
INSERT INTO `sm_codecollect` VALUES ('ZX', '血脂血糖控制情况', '2');
INSERT INTO `sm_codecollect` VALUES ('ZY', '脑血管主要诊断', '2');
INSERT INTO `sm_codecollect` VALUES ('ZZ', 'MRS评分选项', '2');

-- ----------------------------
-- Table structure for sm_codeitem
-- ----------------------------
DROP TABLE IF EXISTS `sm_codeitem`;
CREATE TABLE `sm_codeitem` (
  `CodeID` char(2) NOT NULL DEFAULT '',
  `Code` varchar(50) NOT NULL DEFAULT '',
  `Description` varchar(100) DEFAULT NULL,
  `Pptr` varchar(50) DEFAULT NULL,
  `Cptr` tinyint(4) DEFAULT NULL,
  `Spell` varchar(16) DEFAULT NULL,
  `Remarks` varchar(100) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`CodeID`,`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典明细表';

-- ----------------------------
-- Records of sm_codeitem
-- ----------------------------
INSERT INTO `sm_codeitem` VALUES ('AB', '41', '河南省', 'AB', '1', 'HNS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4101', '河南省郑州市', '41', '1', 'HNSZZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410101', '河南省郑州市市辖区', '4101', '0', 'HNSZZSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410102', '河南省郑州市中原区', '4101', '0', 'HNSZZSZYQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410103', '河南省郑州市二七区', '4101', '0', 'HNSZZSEQQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410104', '河南省郑州市管城回族区', '4101', '0', 'HNSZZSGCHZQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410105', '河南省郑州市金水区', '4101', '0', 'HNSZZSJSQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410106', '河南省郑州市上街区', '4101', '0', 'HNSZZSSJQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410108', '河南省郑州市邙山区', '4101', '0', 'HNSZZSSQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410122', '河南省郑州市中牟县', '4101', '0', 'HNSZZSZMX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410181', '河南省郑州市巩义市', '4101', '0', 'HNSZZSGYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410182', '河南省郑州市荥阳市', '4101', '0', 'HNSZZSYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410183', '河南省郑州市新密市', '4101', '0', 'HNSZZSXMS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410184', '河南省郑州市新郑市', '4101', '0', 'HNSZZSXZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410185', '河南省郑州市登封市', '4101', '0', 'HNSZZSDFS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4102', '河南省开封市', '41', '1', 'HNSKFS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410201', '河南省开封市市辖区', '4102', '0', 'HNSKFSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410202', '河南省开封市龙亭区', '4102', '0', 'HNSKFSLTQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410203', '河南省开封市顺河回族区', '4102', '0', 'HNSKFSSHHZQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410204', '河南省开封市鼓楼区', '4102', '0', 'HNSKFSGLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410205', '河南省开封市南关区', '4102', '0', 'HNSKFSNGQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410211', '河南省开封市郊区', '4102', '0', 'HNSKFSJQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410221', '河南省开封市杞县', '4102', '0', 'HNSKFSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410222', '河南省开封市通许县', '4102', '0', 'HNSKFSTXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410223', '河南省开封市尉氏县', '4102', '0', 'HNSKFSWSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410224', '河南省开封市开封县', '4102', '0', 'HNSKFSKFX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410225', '河南省开封市兰考县', '4102', '0', 'HNSKFSLKX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4103', '河南省洛阳市', '41', '1', 'HNSLYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410301', '河南省洛阳市市辖区', '4103', '0', 'HNSLYSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410302', '河南省洛阳市老城区', '4103', '0', 'HNSLYSLCQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410303', '河南省洛阳市西工区', '4103', '0', 'HNSLYSXGQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410304', '河南省洛阳市廛河回族区', '4103', '0', 'HNSLYSHHZQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410305', '河南省洛阳市涧西区', '4103', '0', 'HNSLYSJXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410306', '河南省洛阳市吉利区', '4103', '0', 'HNSLYSJLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410307', '河南省洛阳市洛龙区', '4103', '0', 'HNSLYSLLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410322', '河南省洛阳市孟津县', '4103', '0', 'HNSLYSMJX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410323', '河南省洛阳市新安县', '4103', '0', 'HNSLYSXAX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410324', '河南省洛阳市栾川县', '4103', '0', 'HNSLYSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410325', '河南省洛阳市嵩县', '4103', '0', 'HNSLYSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410326', '河南省洛阳市汝阳县', '4103', '0', 'HNSLYSRYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410327', '河南省洛阳市宜阳县', '4103', '0', 'HNSLYSYYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410328', '河南省洛阳市洛宁县', '4103', '0', 'HNSLYSLNX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410329', '河南省洛阳市伊川县', '4103', '0', 'HNSLYSYCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410381', '河南省洛阳市偃师市', '4103', '0', 'HNSLYSSS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4104', '河南省平顶山市', '41', '1', 'HNSPDSS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410401', '河南省平顶山市市辖区', '4104', '0', 'HNSPDSSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410402', '河南省平顶山市新华区', '4104', '0', 'HNSPDSSXHQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410403', '河南省平顶山市卫东区', '4104', '0', 'HNSPDSSWDQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410404', '河南省平顶山市石龙区', '4104', '0', 'HNSPDSSSLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410411', '河南省平顶山市湛河区', '4104', '0', 'HNSPDSSZHQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410421', '河南省平顶山市宝丰县', '4104', '0', 'HNSPDSSBFX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410422', '河南省平顶山市叶县', '4104', '0', 'HNSPDSSYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410423', '河南省平顶山市鲁山县', '4104', '0', 'HNSPDSSLSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410425', '河南省平顶山市郏县', '4104', '0', 'HNSPDSSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410481', '河南省平顶山市舞钢市', '4104', '0', 'HNSPDSSWGS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410482', '河南省平顶山市汝州市', '4104', '0', 'HNSPDSSRZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4105', '河南省安阳市', '41', '1', 'HNSAYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410501', '河南省安阳市市辖区', '4105', '0', 'HNSAYSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410502', '河南省安阳市文峰区', '4105', '0', 'HNSAYSWFQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410503', '河南省安阳市北关区', '4105', '0', 'HNSAYSBGQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410505', '河南省安阳市殷都区', '4105', '0', 'HNSAYSYDQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410506', '河南省安阳市龙安区', '4105', '0', 'HNSAYSLAQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410522', '河南省安阳市安阳县', '4105', '0', 'HNSAYSAYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410523', '河南省安阳市汤阴县', '4105', '0', 'HNSAYSTYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410526', '河南省安阳市滑县', '4105', '0', 'HNSAYSHX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410527', '河南省安阳市内黄县', '4105', '0', 'HNSAYSNHX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410581', '河南省安阳市林州市', '4105', '0', 'HNSAYSLZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4106', '河南省鹤壁市', '41', '1', 'HNSHBS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410601', '河南省鹤壁市市辖区', '4106', '0', 'HNSHBSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410602', '河南省鹤壁市鹤山区', '4106', '0', 'HNSHBSHSQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410603', '河南省鹤壁市山城区', '4106', '0', 'HNSHBSSCQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410611', '河南省鹤壁市淇滨区', '4106', '0', 'HNSHBSBQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410621', '河南省鹤壁市浚县', '4106', '0', 'HNSHBSJX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410622', '河南省鹤壁市淇县', '4106', '0', 'HNSHBSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4107', '河南省新乡市', '41', '1', 'HNSXXS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410701', '河南省新乡市市辖区', '4107', '0', 'HNSXXSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410702', '河南省新乡市红旗区', '4107', '0', 'HNSXXSHQQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410703', '河南省新乡市卫滨区', '4107', '0', 'HNSXXSWBQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410704', '河南省新乡市凤泉区', '4107', '0', 'HNSXXSFQQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410711', '河南省新乡市牧野区', '4107', '0', 'HNSXXSMYQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410721', '河南省新乡市新乡县', '4107', '0', 'HNSXXSXXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410724', '河南省新乡市获嘉县', '4107', '0', 'HNSXXSHJX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410725', '河南省新乡市原阳县', '4107', '0', 'HNSXXSYYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410726', '河南省新乡市延津县', '4107', '0', 'HNSXXSYJX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410727', '河南省新乡市封丘县', '4107', '0', 'HNSXXSFQX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410728', '河南省新乡市长垣县', '4107', '0', 'HNSXXSCYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410781', '河南省新乡市卫辉市', '4107', '0', 'HNSXXSWHS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410782', '河南省新乡市辉县市', '4107', '0', 'HNSXXSHXS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4108', '河南省焦作市', '41', '1', 'HNSJZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410801', '河南省焦作市市辖区', '4108', '0', 'HNSJZSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410802', '河南省焦作市解放区', '4108', '0', 'HNSJZSJFQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410803', '河南省焦作市中站区', '4108', '0', 'HNSJZSZZQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410804', '河南省焦作市马村区', '4108', '0', 'HNSJZSMCQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410811', '河南省焦作市山阳区', '4108', '0', 'HNSJZSSYQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410821', '河南省焦作市修武县', '4108', '0', 'HNSJZSXWX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410822', '河南省焦作市博爱县', '4108', '0', 'HNSJZSBAX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410823', '河南省焦作市武陟县', '4108', '0', 'HNSJZSWX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410825', '河南省焦作市温县', '4108', '0', 'HNSJZSWX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410881', '河南省焦作市济源市', '4108', '0', 'HNSJZSJYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410882', '河南省焦作市沁阳市', '4108', '0', 'HNSJZSQYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410883', '河南省焦作市孟州市', '4108', '0', 'HNSJZSMZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4109', '河南省濮阳市', '41', '1', 'HNSYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410901', '河南省濮阳市市辖区', '4109', '0', 'HNSYSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410902', '河南省濮阳市华龙区', '4109', '0', 'HNSYSHLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410922', '河南省濮阳市清丰县', '4109', '0', 'HNSYSQFX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410923', '河南省濮阳市南乐县', '4109', '0', 'HNSYSNLX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410926', '河南省濮阳市范县', '4109', '0', 'HNSYSFX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410927', '河南省濮阳市台前县', '4109', '0', 'HNSYSTQX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '410928', '河南省濮阳市濮阳县', '4109', '0', 'HNSYSYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4110', '河南省许昌市', '41', '1', 'HNSXCS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411001', '河南省许昌市市辖区', '4110', '0', 'HNSXCSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411002', '河南省许昌市魏都区', '4110', '0', 'HNSXCSWDQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411023', '河南省许昌市许昌县', '4110', '0', 'HNSXCSXCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411024', '河南省许昌市鄢陵县', '4110', '0', 'HNSXCSLX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411025', '河南省许昌市襄城县', '4110', '0', 'HNSXCSXCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411081', '河南省许昌市禹州市', '4110', '0', 'HNSXCSYZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411082', '河南省许昌市长葛市', '4110', '0', 'HNSXCSCGS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4111', '河南省漯河市', '41', '1', 'HNSHS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411101', '河南省漯河市市辖区', '4111', '0', 'HNSHSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411102', '河南省漯河市源汇区', '4111', '0', 'HNSHSYHQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411121', '河南省漯河市舞阳县', '4111', '0', 'HNSHSWYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411122', '河南省漯河市临颍县', '4111', '0', 'HNSHSLX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411123', '河南省漯河市郾城县', '4111', '0', 'HNSHSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4112', '河南省三门峡市', '41', '1', 'HNSSMXS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411201', '河南省三门峡市市辖区', '4112', '0', 'HNSSMXSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411202', '河南省三门峡市湖滨区', '4112', '0', 'HNSSMXSHBQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411221', '河南省三门峡市渑池县', '4112', '0', 'HNSSMXSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411222', '河南省三门峡市陕县', '4112', '0', 'HNSSMXSSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411224', '河南省三门峡市卢氏县', '4112', '0', 'HNSSMXSLSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411281', '河南省三门峡市义马市', '4112', '0', 'HNSSMXSYMS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411282', '河南省三门峡市灵宝市', '4112', '0', 'HNSSMXSLBS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4113', '河南省南阳市', '41', '1', 'HNSNYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411301', '河南省南阳市市辖区', '4113', '0', 'HNSNYSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411302', '河南省南阳市宛城区', '4113', '0', 'HNSNYSWCQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411303', '河南省南阳市卧龙区', '4113', '0', 'HNSNYSWLQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411321', '河南省南阳市南召县', '4113', '0', 'HNSNYSNZX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411322', '河南省南阳市方城县', '4113', '0', 'HNSNYSFCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411323', '河南省南阳市西峡县', '4113', '0', 'HNSNYSXXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411324', '河南省南阳市镇平县', '4113', '0', 'HNSNYSZPX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411325', '河南省南阳市内乡县', '4113', '0', 'HNSNYSNXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411326', '河南省南阳市淅川县', '4113', '0', 'HNSNYSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411327', '河南省南阳市社旗县', '4113', '0', 'HNSNYSSQX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411328', '河南省南阳市唐河县', '4113', '0', 'HNSNYSTHX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411329', '河南省南阳市新野县', '4113', '0', 'HNSNYSXYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411330', '河南省南阳市桐柏县', '4113', '0', 'HNSNYSTBX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411381', '河南省南阳市邓州市', '4113', '0', 'HNSNYSDZS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4114', '河南省商丘市', '41', '1', 'HNSSQS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411401', '河南省商丘市市辖区', '4114', '0', 'HNSSQSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411402', '河南省商丘市梁园区', '4114', '0', 'HNSSQSLYQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411403', '河南省商丘市睢阳区', '4114', '0', 'HNSSQSYQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411421', '河南省商丘市民权县', '4114', '0', 'HNSSQSMQX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411422', '河南省商丘市睢县', '4114', '0', 'HNSSQSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411423', '河南省商丘市宁陵县', '4114', '0', 'HNSSQSNLX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411424', '河南省商丘市柘城县', '4114', '0', 'HNSSQSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411425', '河南省商丘市虞城县', '4114', '0', 'HNSSQSYCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411426', '河南省商丘市夏邑县', '4114', '0', 'HNSSQSXYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411481', '河南省商丘市永城市', '4114', '0', 'HNSSQSYCS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4115', '河南省信阳市', '41', '1', 'HNSXYS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411501', '河南省信阳市市辖区', '4115', '0', 'HNSXYSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411502', '河南省信阳市师河区', '4115', '0', 'HNSXYSSHQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411503', '河南省信阳市平桥区', '4115', '0', 'HNSXYSPQQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411521', '河南省信阳市罗山县', '4115', '0', 'HNSXYSLSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411522', '河南省信阳市光山县', '4115', '0', 'HNSXYSGSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411523', '河南省信阳市新县', '4115', '0', 'HNSXYSXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411524', '河南省信阳市商城县', '4115', '0', 'HNSXYSSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411525', '河南省信阳市固始县', '4115', '0', 'HNSXYSGSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411526', '河南省信阳市潢川县', '4115', '0', 'HNSXYSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411527', '河南省信阳市淮滨县', '4115', '0', 'HNSXYSHBX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411528', '河南省信阳市息县', '4115', '0', 'HNSXYSXX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4116', '河南省周口市', '41', '1', 'HNSZKS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411601', '河南省周口市市辖区', '4116', '0', 'HNSZKSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411602', '河南省周口市川汇区', '4116', '0', 'HNSZKSCHQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411621', '河南省周口市扶沟县', '4116', '0', 'HNSZKSFGX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411622', '河南省周口市西华县', '4116', '0', 'HNSZKSXHX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411623', '河南省周口市商水县', '4116', '0', 'HNSZKSSSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411624', '河南省周口市沈丘县', '4116', '0', 'HNSZKSSQX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411625', '河南省周口市郸城县', '4116', '0', 'HNSZKSDCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411626', '河南省周口市淮阳县', '4116', '0', 'HNSZKSHYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411627', '河南省周口市太康县', '4116', '0', 'HNSZKSTKX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411628', '河南省周口市鹿邑县', '4116', '0', 'HNSZKSLYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411681', '河南省周口市项城市', '4116', '0', 'HNSZKSXCS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '4117', '河南省驻马店市', '41', '1', 'HNSZMDS', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411701', '河南省驻马店市市辖区', '4117', '0', 'HNSZMDSSXQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411702', '河南省驻马店市驿城区', '4117', '0', 'HNSZMDSCQ', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411721', '河南省驻马店市西平县', '4117', '0', 'HNSZMDSXPX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411722', '河南省驻马店市上蔡县', '4117', '0', 'HNSZMDSSCX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411723', '河南省驻马店市平舆县', '4117', '0', 'HNSZMDSPYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411724', '河南省驻马店市正阳县', '4117', '0', 'HNSZMDSZYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411725', '河南省驻马店市确山县', '4117', '0', 'HNSZMDSQSX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411726', '河南省驻马店市泌阳县', '4117', '0', 'HNSZMDSMYX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411727', '河南省驻马店市汝南县', '4117', '0', 'HNSZMDSRNX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411728', '河南省驻马店市遂平县', '4117', '0', 'HNSZMDSSPX', null);
INSERT INTO `sm_codeitem` VALUES ('AB', '411729', '河南省驻马店市新蔡县', '4117', '0', 'HNSZMDSXCX', null);
INSERT INTO `sm_codeitem` VALUES ('AX', '0', '未知', 'AX', '0', 'WZ', null);
INSERT INTO `sm_codeitem` VALUES ('AX', '1', '男', 'AX', '0', 'N', null);
INSERT INTO `sm_codeitem` VALUES ('AX', '2', '女', 'AX', '0', 'N', null);
INSERT INTO `sm_codeitem` VALUES ('AX', '9', '未说明', 'AX', '0', 'WSM', null);
INSERT INTO `sm_codeitem` VALUES ('YA', '01', '心肌梗死', 'YA', '0', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0101', 'ST段抬高型心肌梗死', '01', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0102', '非ST段抬高型心肌梗死', '01', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0103', '不详', '01', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '02', '心绞痛', 'YA', '0', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0201', '稳定型', '02', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0202', '不稳定型', '02', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YA', '0203', '不详', '02', '1', NULL, NULL);
INSERT INTO `sm_codeitem` VALUES ('YB', '01', '下肢动脉病变', 'YB', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YB', '02', '眼底血管病变', 'YB', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YB', '03', '口腔炎症', 'YB', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YB', '04', '精神心理疾病', 'YB', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YC', '01', '房颤', 'YC', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YC', '02', '其他类型心律失常', 'YC', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YD', '01', '空腹血糖', 'YD', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YD', '02', '餐后2小时血糖（推荐）', 'YD', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YD', '03', '糖化血红蛋白（糖尿病人推荐做）', 'YD', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YE', '01', '绿色', 'YE', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YE', '02', '黄色', 'YE', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YE', '03', '红色', 'YE', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YF', '01', '健康管理', 'YF', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YF', '02', '规范化管理', 'YF', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('YF', '03', '强化管理', 'YF', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZA', '01', '管理员权限用户', 'ZA', '0', 'GLYYH', null);
INSERT INTO `sm_codeitem` VALUES ('ZA', '02', '社区机构用户', 'ZA', '0', 'SQJGYH', null);
INSERT INTO `sm_codeitem` VALUES ('ZA', '03', '医院机构用户', 'ZA', '0', 'YYJGYH', null);
INSERT INTO `sm_codeitem` VALUES ('ZA', '04', 'APP注册用户', 'ZA', '0', 'APPZCYH', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '01', '管理员权限', 'ZB', '0', 'GLYQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '02', '个人权限', 'ZB', '0', 'GRQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '03', '机构权限', 'ZB', '0', 'JGQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '04', '乡镇级权限', 'ZB', '0', 'XZJQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '05', '县区级权限', 'ZB', '0', 'XQJQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '06', '市级权限', 'ZB', '0', 'SJQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '07', '省级权限', 'ZB', '0', 'SJQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZB', '08', '特殊权限', 'ZB', '0', 'TSQX', null);
INSERT INTO `sm_codeitem` VALUES ('ZC', '01', '医疗卫生服务机构', 'ZC', '0', 'YLWSFWJG', null);
INSERT INTO `sm_codeitem` VALUES ('ZC', '02', '专业卫生服务机构', 'ZC', '0', 'ZYWSFWJG', null);
INSERT INTO `sm_codeitem` VALUES ('ZC', '03', '卫生行政管理机构', 'ZC', '0', 'WSXZGLJG', null);
INSERT INTO `sm_codeitem` VALUES ('ZD', '01', '身份证', 'ZD', '0', 'SFZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZD', '02', '军官证', 'ZD', '0', 'JGZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZD', '03', '护照', 'ZD', '0', 'HZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '01', '入组', 'ZE', '0', 'RZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '02', '检验', 'ZE', '0', 'JY', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '03', '诊断', 'ZE', '0', 'ZD', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '04', '治疗', 'ZE', '0', 'ZL', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '05', '随访', 'ZE', '0', 'SF', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '06', '完成', 'ZE', '0', 'WC', null);
INSERT INTO `sm_codeitem` VALUES ('ZE', '07', '终止', 'ZE', '0', 'ZZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZF', '01', '低危', 'ZF', '0', 'DW', null);
INSERT INTO `sm_codeitem` VALUES ('ZF', '02', '中危', 'ZF', '0', 'ZW', null);
INSERT INTO `sm_codeitem` VALUES ('ZF', '03', '高危（n>=3）', 'ZF', '0', 'GW', null);
INSERT INTO `sm_codeitem` VALUES ('ZF', '04', 'TLA', 'ZF', '0', 'TLA', null);
INSERT INTO `sm_codeitem` VALUES ('ZF', '05', '脑卒中', 'ZF', '0', 'NCZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZG', '01', '社区筛查', 'ZG', '0', 'SQSC', null);
INSERT INTO `sm_codeitem` VALUES ('ZG', '02', '医院筛查', 'ZG', '0', 'YYSC', null);
INSERT INTO `sm_codeitem` VALUES ('ZG', '03', '患者检查', 'ZG', '0', 'HZJC', null);
INSERT INTO `sm_codeitem` VALUES ('ZG', '04', 'HIS系统转入', 'ZG', '0', 'HISXTZR', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '01', '汉族', 'ZH', '0', 'HZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '02', '蒙古族', 'ZH', '0', 'MGZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '03', '回族', 'ZH', '0', 'HZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '04', '藏族', 'ZH', '0', 'CZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '05', '维吾尔族', 'ZH', '0', 'WWEZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '06', '苗族', 'ZH', '0', 'MZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '07', '彝族', 'ZH', '0', 'YZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '08', '壮族', 'ZH', '0', 'ZZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '09', '布依族', 'ZH', '0', 'BYZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '10', '朝鲜族', 'ZH', '0', 'CXZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '11', '满族', 'ZH', '0', 'MZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '12', '侗族', 'ZH', '0', 'DZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '13', '瑶族', 'ZH', '0', 'YZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '14', '白族', 'ZH', '0', 'BZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '15', '土家族', 'ZH', '0', 'TJZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '16', '哈尼族', 'ZH', '0', 'HNZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '17', '哈萨克族', 'ZH', '0', 'HSKZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '18', '傣族', 'ZH', '0', 'DZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '19', '黎族', 'ZH', '0', 'LZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '20', '傈僳族', 'ZH', '0', 'LSZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '21', '佤族', 'ZH', '0', 'Z', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '22', '畲族', 'ZH', '0', 'Z', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '23', '高山族', 'ZH', '0', 'GSZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '24', '拉祜族', 'ZH', '0', 'LZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '25', '水族', 'ZH', '0', 'SZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '26', '东乡族', 'ZH', '0', 'DXZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '27', '纳西族', 'ZH', '0', 'NXZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '28', '景颇族', 'ZH', '0', 'JPZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '29', '柯尔克孜族', 'ZH', '0', 'KEKZZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '30', '土族', 'ZH', '0', 'TZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '31', '达斡尔族', 'ZH', '0', 'DWEZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '32', '仫佬族', 'ZH', '0', 'LZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '33', '羌族', 'ZH', '0', 'QZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '34', '布朗族', 'ZH', '0', 'BLZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '35', '撒拉族', 'ZH', '0', 'SLZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '36', '毛南族', 'ZH', '0', 'MNZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '37', '仡佬族', 'ZH', '0', 'LZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '38', '锡伯族', 'ZH', '0', 'XBZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '39', '阿昌族', 'ZH', '0', 'ACZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '40', '普米族', 'ZH', '0', 'PMZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '41', '塔吉克族', 'ZH', '0', 'TJKZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '42', '怒族', 'ZH', '0', 'NZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '43', '乌孜别克族', 'ZH', '0', 'WZBKZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '44', '俄罗斯族', 'ZH', '0', 'ELSZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '45', '鄂温克族', 'ZH', '0', 'EWKZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '46', '德昂族', 'ZH', '0', 'DAZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '47', '保安族', 'ZH', '0', 'BAZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '48', '裕固族', 'ZH', '0', 'YGZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '49', '京族', 'ZH', '0', 'JZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '50', '塔塔尔族', 'ZH', '0', 'TTEZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '51', '独龙族', 'ZH', '0', 'DLZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '52', '鄂伦春族', 'ZH', '0', 'ELCZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '53', '赫哲族', 'ZH', '0', 'HZZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '54', '门巴族', 'ZH', '0', 'MBZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '55', '珞巴族', 'ZH', '0', 'BZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '56', '基诺族', 'ZH', '0', 'JNZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '97', '其他', 'ZH', '0', 'QT', null);
INSERT INTO `sm_codeitem` VALUES ('ZH', '98', '外国血统中国籍人士', 'ZH', '0', 'WGXTZGJRS', null);
INSERT INTO `sm_codeitem` VALUES ('ZI', '01', '小学及以下', 'ZI', '0', 'XXJYX', null);
INSERT INTO `sm_codeitem` VALUES ('ZI', '02', '初中', 'ZI', '0', 'CZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZI', '03', '中专/高中', 'ZI', '0', 'ZZJGZ', null);
INSERT INTO `sm_codeitem` VALUES ('ZI', '04', '大专/大本', 'ZI', '0', 'DZJDB', null);
INSERT INTO `sm_codeitem` VALUES ('ZI', '05', '硕士及以上', 'ZI', '0', 'SSJYS', null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '01', '国家机关、党群组织、企业、事业单位负责人', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '02', '专业技术人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '03', '办事人员和有关人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '04', '商业、服务业人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '05', '农、林、牧、渔、水利业生产人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '06', '生产、运输设备操作人员及有关人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '07', '军人', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZJ', '08', '不便分类的其他从业人员', 'ZJ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZK', '01', '5千元以下', 'ZK', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZK', '02', '5千-1万', 'ZK', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZK', '03', '1万-2万', 'ZK', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZK', '04', '2万元以上', 'ZK', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '01', '城镇职工基本医疗保险', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '02', '新城镇居民基本医疗保险', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '03', '新型农村合作医疗', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '04', '商业医疗保险', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '05', '全公费', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '06', '全自费', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '07', '其他社会保险', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '08', '贫困救助', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZL', '09', '其他', 'ZL', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZM', '01', '父母', 'ZM', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZM', '02', '配偶', 'ZM', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZM', '03', '子女', 'ZM', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZM', '04', '兄弟姐妹', 'ZM', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZM', '05', '其他', 'ZM', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '01', '吸烟（否）', 'ZN', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '0101', '是否被动吸烟（暴露于吸烟者呼出烟雾的场所）（否）', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '0102', '是否被动吸烟（暴露于吸烟者呼出烟雾的场所）（是）', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '02', '吸烟（是）', 'ZN', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '0201', '正在吸烟', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZN', '0202', '已戒烟', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZO', '01', '无饮酒习惯', 'ZO', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZO', '02', '有饮酒习惯，但很少大量饮用', 'ZO', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZO', '03', '经常大量饮酒（白酒≥3次/周，每次≥2两）', 'ZO', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZP', '01', '经常运动（相当于快步走的中等强度运动，且每周≥3次、每次≥30分钟，包含中度、重度体力劳动者)', 'ZP', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZP', '02', '缺乏运动 (不符合上述经常运动标准者）', 'ZP', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '01', '口味', 'ZQ', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0101', '偏咸', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0102', '偏油', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0103', '喜甜食', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0104', '其他', '01', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '02', '荤素', 'ZQ', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0201', '荤素均衡', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0202', '多食肉类', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0203', '素食为主', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '03', '吃蔬菜', 'ZQ', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0301', '≥5天/周', '03', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0302', '3-4天/周', '03', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0303', '≤2天/周', '03', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '04', '吃水果', 'ZQ', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0401', '≥5天/周', '04', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0402', '3-4天/周', '04', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0403', '≤2天/周', '04', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '05', '牛奶或酸奶', 'ZQ', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0501', '≥200毫升/天且≥5天/周', '05', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0502', '偶尔或从不喝', '05', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZQ', '0503', '不属于以上两种情况', '05', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZR', '01', '脑卒中（中风）', 'ZR', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZR', '02', '冠心病', 'ZR', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZR', '03', '高血压', 'ZR', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZR', '04', '糖尿病', 'ZR', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZR', '05', '血脂异常', 'ZR', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZS', '01', '从未测量', 'ZS', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZS', '02', '经常测量（每月至少1次）', 'ZS', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZS', '03', '偶尔测量', 'ZS', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZT', '01', '基本平稳', 'ZT', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZT', '02', '波动较大', 'ZT', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZT', '03', '不清楚', 'ZT', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '01', '降压药物', 'ZU', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0101', '利尿药', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010101', '螺内酯', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010102', '呋塞米', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010103', '氢氯噻嗪', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010104', '吲达帕胺', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010105', '布美他尼', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010106', '氨苯蝶啶', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010107', '苄氟噻嗪', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010108', '托拉塞米', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010109', '阿米洛利', '0101', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0102', '钙拮抗剂', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010201', '氨氯地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010202', '非洛地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010203', '硝苯地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010204', '尼群地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010205', '拉西地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010206', '尼卡地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010207', '地尔硫卓', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010208', '巴尼地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010209', '贝尼地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010210', '乐卡地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010211', '尼索地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010212', '西尔尼地平', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010213', '维拉帕米', '0102', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0103', 'β受体阻滞剂', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010301', '美托洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010302', '普萘洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010303', '阿替洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010304', '比索洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010305', '拉贝洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010306', '塞利洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010307', '倍他洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010308', '卡维地洛', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010309', '噻吗洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010310', '索他洛尔', '0103', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0104', 'α受体阻滞剂', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010401', '布那唑嗪', '0104', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010402', '多沙唑嗪', '0104', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010403', '哌唑嗪', '0104', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010404', '特拉唑嗪', '0104', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010405', '乌拉地尔', '0104', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0105', 'α，β受体阻滞剂', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010501', '阿罗洛尔', '0105', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010502', '卡维地洛', '0105', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010503', '拉贝洛尔', '0105', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0106', 'ACEI', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010601', '赖诺普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010602', '福辛普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010603', '培哚普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010604', '依那普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010605', '西拉普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010606', '雷米普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010607', '咪达普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010608', '贝那普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010609', '卡托普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010610', '西拉普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010611', '喹那普利', '0106', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0107', 'ARB', '01', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010701', '奥美沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010702', '替米沙坦/特米沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010703', '氯沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010704', '缬沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010705', '厄贝沙坦/伊贝沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010706', '坎地沙坦', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '010707', '缬奥美沙坦酯', '0107', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '02', '降同型半胱氨酸药', 'ZU', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0201', '叶酸', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0202', 'VitB12', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0203', 'VitB6', '02', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '03', '调脂药物', 'ZU', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0301', '他汀类', '03', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030101', '阿托伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030102', '瑞舒伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030103', '辛伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030104', '普伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030105', '氟伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030106', '洛伐他汀', '0301', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0302', '贝特类', '03', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030201', '非诺贝特', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030202', '吉非贝齐/吉非罗齐', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030203', '苯扎贝特', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030204', '氯贝特', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030205', '依泽替米贝', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030206', '非诺贝特', '0302', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0303', '胆固醇吸收抑制剂', '03', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030301', '依折麦布辛伐他汀', '0303', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '030302', '依折麦布', '0303', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '04', '降糖药物', 'ZU', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0401', '格列奈类', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040101', '瑞格列奈', '0401', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040102', '那格列奈', '0401', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0402', 'α-糖苷酶抑制剂类', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040201', '阿卡波糖', '0402', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040202', '伏格列波糖', '0402', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040203', '米格列醇', '0402', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0403', '双胍类', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040301', '二甲双胍', '0403', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040302', '苯乙双胍', '0403', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040303', '丁二胍', '0403', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0404', '格列酮类', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040401', '吡格列酮', '0404', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040402', '罗格列酮', '0404', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0405', '磺酰脲类', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040501', '格列本脲', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040502', '格列吡嗪', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040503', '格列齐特', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040504', '格列波脲', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040505', '格列喹酮', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040506', '格列美脲', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040507', '格列嘧啶', '0405', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0406', '胰岛素', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040601', '普通胰岛素', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040602', '优泌林R', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040603', '优泌林70/30', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040604', '优泌林N', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040605', '诺和灵30R', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040606', '诺和灵50R', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040607', '诺和灵N', '0406', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0407', 'DPP-4抑制剂', '04', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040701', '西格列汀', '0407', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '040702', '沙格列汀', '0407', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '05', '抗栓药物', 'ZU', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0501', '抗凝药物', '05', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050101', '华法林', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050102', '肝素类', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050103', '普通肝素', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050104', '水蛭素', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050105', '低分子肝素钙', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050106', '低分子肝素钠', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050107', '纤维蛋白溶解酶', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050108', '蚓激酶', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050109', '降纤酶', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050110', '利伐沙班', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050111', '达比加群', '0501', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '0502', '抗血小板药物', '05', '1', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050201', '阿司匹林', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050202', '氯吡格雷', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050203', '奥扎格雷', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050204', '双嘧达莫/潘生丁', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050205', '西洛他唑', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZU', '050206', '替格瑞洛', '0502', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZW', '01', '从未检测', 'ZW', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZW', '02', '定期检测', 'ZW', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZW', '03', '偶尔检测（每年检测不足1次）', 'ZW', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZX', '01', '基本达标', 'ZX', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZX', '02', '未达标', 'ZX', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZX', '03', '不清楚', 'ZX', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZY', '01', '脑梗死', 'ZY', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZY', '02', '脑出血', 'ZY', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZY', '03', '蛛网膜下腔出血', 'ZY', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZY', '04', '短暂性脑缺血发作（TIA）', 'ZY', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '01', '完全无症状', 'ZZ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '02', '尽管有症状，但无明显功能障碍，能完成所有日常工作和生活', 'ZZ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '03', '轻度残疾，不能完成病前所有活动，但不需帮助能照顾自己的日常生活', 'ZZ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '04', '中度残疾，需部分帮助，但能独立行走', 'ZZ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '05', '重度残疾，不能独立行走，无他人帮助不能满足自身日常生活需求', 'ZZ', '0', null, null);
INSERT INTO `sm_codeitem` VALUES ('ZZ', '06', '严重残疾，持续卧床、二便失禁，需持续护理和关注，日常生活完全依赖他人', 'ZZ', '0', null, null);

-- ----------------------------
-- Table structure for sm_department
-- ----------------------------
DROP TABLE IF EXISTS `sm_department`;
CREATE TABLE `sm_department` (
  `depBM` varchar(20) NOT NULL COMMENT '此值为后台处理，不在前端显示',
  `depName` varchar(70) DEFAULT NULL COMMENT '机构名称',
  `Description` varchar(200) DEFAULT NULL COMMENT '描述',
  `InstitutionType` varchar(20) DEFAULT NULL COMMENT '机构类型（数据来源于codeitem，类型为ZC）',
  `depFlag` varchar(2) DEFAULT NULL COMMENT '值为0是机构，值为1为科室',
  `PPtr` varchar(20) DEFAULT NULL COMMENT '值为UN为机构',
  `CPtr` varchar(1) DEFAULT NULL,
  `Status` varchar(1) DEFAULT '1' COMMENT '状态（1是启用，0是暂停）',
  `Logo` varchar(100) DEFAULT NULL COMMENT '机构Logo(只有机构才有Logo，登录人员根据机构动态显示Logo图片，没有则显示默认)',
  `LinkMan` varchar(30) DEFAULT NULL COMMENT '联系人',
  `LinkManTel` varchar(30) DEFAULT NULL COMMENT '联系人电话',
  `InstitutionTel` varchar(30) DEFAULT NULL COMMENT '机构电话',
  `Address` varchar(255) DEFAULT NULL COMMENT '地址',
  `CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `UserName` varchar(20) DEFAULT NULL COMMENT '创建人（数据来自于用户表用户名）',
  `Area` varchar(20) DEFAULT NULL COMMENT '所属区域，来自于sm_codeitem的Codeid为AB的code值',
  `zorder` int(11) DEFAULT NULL COMMENT '显示顺序',
  PRIMARY KEY (`depBM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='机构科室表';

-- ----------------------------
-- Records of sm_department
-- ----------------------------
INSERT INTO `sm_department` VALUES ('0000001', '郑大第一附属医院', '', null, '0', 'UN', '1', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000001001', '住院部', '', null, '1', '0000001', '1', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000001002', '门诊部', '', null, '1', '0000001', '1', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000001002001', '心脑血管科室', '', null, '1', '0000001002', '0', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000001002002', '脑卒中专科门诊', '', null, '1', '0000001002', '0', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000002', '郑州中医院', '', null, '0', 'UN', '1', null, null, null, null, null, null, null, null, null, '2');
INSERT INTO `sm_department` VALUES ('0000002001', '门诊一部', '', null, '1', '0000002', '0', null, null, null, null, null, null, null, null, null, '1');
INSERT INTO `sm_department` VALUES ('0000002002', '门诊二部', '', null, '1', '0000002', '0', null, null, null, null, null, null, null, null, null, '2');
INSERT INTO `sm_department` VALUES ('0000002003', '住院一部', '', null, '1', '0000002', '0', null, null, null, null, null, null, null, null, null, '3');

-- ----------------------------
-- Table structure for sm_modular
-- ----------------------------
DROP TABLE IF EXISTS `sm_modular`;
CREATE TABLE `sm_modular` (
  `ModularID` int(11) NOT NULL COMMENT '程序模块编码',
  `ParentModularID` int(11) DEFAULT NULL COMMENT '上级模块编码',
  `ModularName` varchar(50) NOT NULL COMMENT '名称',
  `Uri` varchar(200) DEFAULT NULL COMMENT '功能模块地址',
  `ModularDesc` varchar(200) DEFAULT NULL COMMENT '描述',
  `DisplayOrder` int(11) DEFAULT NULL COMMENT '顺序',
  `Crud` varchar(50) DEFAULT NULL COMMENT '增删改查',
  `HomeModular` varchar(1) NOT NULL DEFAULT '0' COMMENT '0:一级功能；1：二级功能',
  PRIMARY KEY (`ModularID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='功能模块表';

-- ----------------------------
-- Records of sm_modular
-- ----------------------------

-- ----------------------------
-- Table structure for sm_role
-- ----------------------------
DROP TABLE IF EXISTS `sm_role`;
CREATE TABLE `sm_role` (
  `RoleID` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `RoleDesc` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `PowerLevel` varchar(20) DEFAULT NULL COMMENT '角色权限（数据来自于sm_codeitem的code字段，codeid值为ZB）',
  `PowerSQL` varchar(500) DEFAULT NULL COMMENT 'SQL',
  PRIMARY KEY (`RoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of sm_role
-- ----------------------------
INSERT INTO `sm_role` VALUES ('1', '管理员', '管理员权限', '01', null);
INSERT INTO `sm_role` VALUES ('2', '个人用户', '个人数据权限', '02', null);
INSERT INTO `sm_role` VALUES ('3', '机构用户', '机构数据权限', '03', '');

-- ----------------------------
-- Table structure for sm_role_modular
-- ----------------------------
DROP TABLE IF EXISTS `sm_role_modular`;
CREATE TABLE `sm_role_modular` (
  `RoleModularID` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色功能模块ID',
  `RoleID` int(11) DEFAULT NULL COMMENT '角色ID',
  `ModularID` int(11) DEFAULT NULL COMMENT '功能模块ID',
  PRIMARY KEY (`RoleModularID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色功能权限表';

-- ----------------------------
-- Records of sm_role_modular
-- ----------------------------

-- ----------------------------
-- Table structure for sm_user
-- ----------------------------
DROP TABLE IF EXISTS `sm_user`;
CREATE TABLE `sm_user` (
  `UserName` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `PassWord` varchar(50) DEFAULT NULL COMMENT '密码',
  `Email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `States` varchar(1) DEFAULT '1' COMMENT '状态（1有效、0无效）',
  `FullName` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Mobile` varchar(30) DEFAULT NULL COMMENT '联系方式',
  `depBM` varchar(20) DEFAULT NULL COMMENT '所属机构（注意是科室代码）',
  `RoleID` varchar(20) DEFAULT NULL COMMENT '所属角色',
  `UserType` varchar(20) DEFAULT NULL COMMENT '用户类型(数据来源于codeitem的ZA)',
  `CreateDate` datetime DEFAULT NULL COMMENT '创建时间',
  `IDNumber` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sm_user
-- ----------------------------
INSERT INTO `sm_user` VALUES ('admin', '1234@abcd', null, '1', '瞿晓明', '13567876655', '0000001002002', '1', '01', '2015-12-03 14:23:51', '423456198708187215');
INSERT INTO `sm_user` VALUES ('qxmyygr', '1234@abcd', null, '1', '瞿晓明', '13567876655', '0000001002002', '2', '03', '2015-12-03 14:41:29', '423456198708187215');
INSERT INTO `sm_user` VALUES ('qxmyyjg', '1234@abcd', null, '1', '瞿晓明', '13567876655', '0000001002002', '3', '03', '2015-12-03 14:51:13', '423456198708187215');

-- ----------------------------
-- Table structure for user_personal_info
-- ----------------------------
DROP TABLE IF EXISTS `user_personal_info`;
CREATE TABLE `user_personal_info` (
  `UserPersonalInfoID` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(50) DEFAULT NULL COMMENT '用户名',
  `Name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `Sex` varchar(1) DEFAULT NULL COMMENT '性别(0:男；1：女)',
  `BirthDate` datetime NOT NULL COMMENT '出生日期',
  `Nationality` varchar(60) DEFAULT NULL COMMENT '国籍',
  `PoliticsStatus` varchar(50) DEFAULT NULL COMMENT '政治面貌 ',
  `IdNumber` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `Nation` varchar(50) DEFAULT NULL COMMENT '民族 ',
  `Post` varchar(50) DEFAULT NULL COMMENT '职务 ',
  `GraduateInstitutions` varchar(50) DEFAULT NULL COMMENT '毕业院校 ',
  `GraduateDate` datetime NOT NULL COMMENT '毕业时间 ',
  `Education` varchar(50) DEFAULT NULL COMMENT '学历',
  `Degree` varchar(50) DEFAULT NULL COMMENT '学位',
  `Specialty` varchar(50) DEFAULT NULL COMMENT '专业 ',
  `Grade` varchar(50) DEFAULT NULL COMMENT '执业医师级别',
  `Category` varchar(50) DEFAULT NULL COMMENT '执业类别 ',
  `Tel` varchar(50) DEFAULT NULL COMMENT '手机',
  PRIMARY KEY (`UserPersonalInfoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户个人信息表';

-- ----------------------------
-- Records of user_personal_info
-- ----------------------------
