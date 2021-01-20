package com.example.demo.index;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
    List<BasicInfo> findAllByOrderByIdDesc();
    @Query("Select distinct x from BasicInfo x  left join Boston y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByBostonBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join CDR y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByCDRBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join DailyLife y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByDailyLifeBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Execution y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByExecutionBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Gait y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByGaitBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join HAMA y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByHAMABasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join HAMD y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByHAMDBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Memory y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByMemoryBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join MMSE y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByMMSEBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join MOCA y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByMOCABasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join NIHSS y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByNIHSSBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join SilhouetteQuiz y on y.basicInfoId = x.id")
    List<BasicInfo> findAllBySilhouetteQuizBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join VisualReproduction y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByVisualReproductionBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Other y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByOtherBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Testing y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByTestingBasicInfoId();
    @Query("Select distinct x from BasicInfo x  left join Image y on y.basicInfoId = x.id")
    List<BasicInfo> findAllByImageBasicInfoId();
}
