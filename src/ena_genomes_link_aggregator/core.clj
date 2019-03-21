(ns ena-genomes-link-aggregator.core
  (:use etaoin.api)
  (:require [etaoin.keys :as keys]
            [clojure.edn :as edn]))



;;;;;;;;;

(def genomes
  [
   "SRR5073987"
;; SRR4423177
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR442/007/SRR4423177/SRR4423177_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR442/007/SRR4423177/SRR4423177_2.fastq.gz
;; SRR3082083
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR308/003/SRR3082083/SRR3082083_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR308/003/SRR3082083/SRR3082083_2.fastq.gz
;; SRR3082090
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR308/000/SRR3082090/SRR3082090_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR308/000/SRR3082090/SRR3082090_2.fastq.gz
;; SRR5818699
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR581/009/SRR5818699/SRR5818699_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR581/009/SRR5818699/SRR5818699_2.fastq.gz
;; SRR5818705
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR581/005/SRR5818705/SRR5818705_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR581/005/SRR5818705/SRR5818705_2.fastq.gz
;; ERR1394280
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR139/000/ERR1394280/ERR1394280_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR139/000/ERR1394280/ERR1394280_2.fastq.gz
;; SRR3105766
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/006/SRR3105766/SRR3105766_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/006/SRR3105766/SRR3105766_2.fastq.gz
;; SRR3105776
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/006/SRR3105776/SRR3105776_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/006/SRR3105776/SRR3105776_2.fastq.gz
;; SRR3105777
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/007/SRR3105777/SRR3105777_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR310/007/SRR3105777/SRR3105777_2.fastq.gz
;; SRR5314269
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR531/009/SRR5314269/SRR5314269_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR531/009/SRR5314269/SRR5314269_2.fastq.gz
;; SRR5341242
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR534/002/SRR5341242/SRR5341242_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR534/002/SRR5341242/SRR5341242_2.fastq.gz
;; SRR5341244
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR534/004/SRR5341244/SRR5341244_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR534/004/SRR5341244/SRR5341244_2.fastq.gz
;; SRR6480514
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR648/004/SRR6480514/SRR6480514_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR648/004/SRR6480514/SRR6480514_2.fastq.gz
;; ERR036201
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036201/ERR036201_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036201/ERR036201_2.fastq.gz
;; ERR036213
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036213/ERR036213_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036213/ERR036213_2.fastq.gz
;; ERR036217
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036217/ERR036217_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036217/ERR036217_2.fastq.gz
;; ERR036222
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036222/ERR036222_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036222/ERR036222_2.fastq.gz
;; ERR036236
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036236/ERR036236_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR036/ERR036236/ERR036236_2.fastq.gz
;; ERR037511
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR037/ERR037511/ERR037511_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR037/ERR037511/ERR037511_2.fastq.gz
;; ERR124640
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR124/ERR124640/ERR124640_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR124/ERR124640/ERR124640_2.fastq.gz
;; ERR126605
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR126/ERR126605/ERR126605_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR126/ERR126605/ERR126605_2.fastq.gz
;; ERR126631
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR126/ERR126631/ERR126631_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR126/ERR126631/ERR126631_2.fastq.gz
;; ERR161031
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161031/ERR161031_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161031/ERR161031_2.fastq.gz
;; ERR161059
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161059/ERR161059_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161059/ERR161059_2.fastq.gz
;; ERR161063
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161063/ERR161063_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161063/ERR161063_2.fastq.gz
;; ERR161085
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161085/ERR161085_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161085/ERR161085_2.fastq.gz
;; ERR161089
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161089/ERR161089_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161089/ERR161089_2.fastq.gz
;; ERR161131
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161131/ERR161131_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161131/ERR161131_2.fastq.gz
;; ERR161180
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161180/ERR161180_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161180/ERR161180_2.fastq.gz
;; ERR161181
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161181/ERR161181_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161181/ERR161181_2.fastq.gz
;; ERR161190
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161190/ERR161190_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161190/ERR161190_2.fastq.gz
;; ERR161201
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161201/ERR161201_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR161/ERR161201/ERR161201_2.fastq.gz
;; ERR163935
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163935/ERR163935_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163935/ERR163935_2.fastq.gz
;; ERR163952
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163952/ERR163952_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163952/ERR163952_2.fastq.gz
;; ERR163954
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163954/ERR163954_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163954/ERR163954_2.fastq.gz
;; ERR163962
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163962/ERR163962_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163962/ERR163962_2.fastq.gz
;; ERR163972
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163972/ERR163972_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163972/ERR163972_2.fastq.gz
;; ERR163982
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163982/ERR163982_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163982/ERR163982_2.fastq.gz
;; ERR163994
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163994/ERR163994_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR163/ERR163994/ERR163994_2.fastq.gz
;; ERR164000
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR164/ERR164000/ERR164000_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR164/ERR164000/ERR164000_2.fastq.gz
;; ERR176446
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176446/ERR176446_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176446/ERR176446_2.fastq.gz
;; ERR176456
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176456/ERR176456_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176456/ERR176456_2.fastq.gz
;; ERR176483
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176483/ERR176483_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176483/ERR176483_2.fastq.gz
;; ERR176490
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176490/ERR176490_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176490/ERR176490_2.fastq.gz
;; ERR176491
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176491/ERR176491_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176491/ERR176491_2.fastq.gz
;; ERR176517
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176517/ERR176517_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176517/ERR176517_2.fastq.gz
;; ERR176564
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176564/ERR176564_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176564/ERR176564_2.fastq.gz
;; ERR176588
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176588/ERR176588_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176588/ERR176588_2.fastq.gz
;; ERR176604
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176604/ERR176604_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176604/ERR176604_2.fastq.gz
;; ERR176630
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176630/ERR176630_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176630/ERR176630_2.fastq.gz
;; ERR176677
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176677/ERR176677_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176677/ERR176677_2.fastq.gz
;; ERR176689
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176689/ERR176689_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176689/ERR176689_2.fastq.gz
;; ERR176713
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176713/ERR176713_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176713/ERR176713_2.fastq.gz
;; ERR176723
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176723/ERR176723_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176723/ERR176723_2.fastq.gz
;; ERR176747
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176747/ERR176747_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176747/ERR176747_2.fastq.gz
;; ERR176770
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176770/ERR176770_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176770/ERR176770_2.fastq.gz
;; ERR176775
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176775/ERR176775_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176775/ERR176775_2.fastq.gz
;; ERR176823
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176823/ERR176823_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR176/ERR176823/ERR176823_2.fastq.gz
;; ERR181682
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181682/ERR181682_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181682/ERR181682_2.fastq.gz
;; ERR181687
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181687/ERR181687_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181687/ERR181687_2.fastq.gz
;; ERR181723
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181723/ERR181723_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181723/ERR181723_2.fastq.gz
;; ERR181750
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181750/ERR181750_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181750/ERR181750_2.fastq.gz
;; ERR181752
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181752/ERR181752_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181752/ERR181752_2.fastq.gz
;; ERR181760
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181760/ERR181760_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181760/ERR181760_2.fastq.gz
;; ERR181775
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181775/ERR181775_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181775/ERR181775_2.fastq.gz
;; ERR181779
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181779/ERR181779_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181779/ERR181779_2.fastq.gz
;; ERR181793
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181793/ERR181793_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181793/ERR181793_2.fastq.gz
;; ERR181795
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181795/ERR181795_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181795/ERR181795_2.fastq.gz
;; ERR181799
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181799/ERR181799_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181799/ERR181799_2.fastq.gz
;; ERR181819
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181819/ERR181819_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181819/ERR181819_2.fastq.gz
;; ERR181820
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181820/ERR181820_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181820/ERR181820_2.fastq.gz
;; ERR181831
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181831/ERR181831_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181831/ERR181831_2.fastq.gz
;; ERR181860
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181860/ERR181860_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181860/ERR181860_2.fastq.gz
;; ERR181910
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181910/ERR181910_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181910/ERR181910_2.fastq.gz
;; ERR181920
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181920/ERR181920_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181920/ERR181920_2.fastq.gz
;; ERR181929
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181929/ERR181929_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181929/ERR181929_2.fastq.gz
;; ERR181930
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181930/ERR181930_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181930/ERR181930_2.fastq.gz
;; ERR181933
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181933/ERR181933_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181933/ERR181933_2.fastq.gz
;; ERR181949
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181949/ERR181949_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181949/ERR181949_2.fastq.gz
;; ERR181961
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181961/ERR181961_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181961/ERR181961_2.fastq.gz
;; ERR181963
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181963/ERR181963_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181963/ERR181963_2.fastq.gz
;; ERR181969
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181969/ERR181969_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181969/ERR181969_2.fastq.gz
;; ERR181982
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181982/ERR181982_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR181/ERR181982/ERR181982_2.fastq.gz
;; ERR182008
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182008/ERR182008_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182008/ERR182008_2.fastq.gz
;; ERR182009
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182009/ERR182009_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182009/ERR182009_2.fastq.gz
;; ERR182024
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182024/ERR182024_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182024/ERR182024_2.fastq.gz
;; ERR182042
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182042/ERR182042_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182042/ERR182042_2.fastq.gz
;; ERR182054
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182054/ERR182054_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR182/ERR182054/ERR182054_2.fastq.gz
;; ERR190344
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190344/ERR190344_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190344/ERR190344_2.fastq.gz
;; ERR190345
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190345/ERR190345_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190345/ERR190345_2.fastq.gz
;; ERR190361
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190361/ERR190361_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190361/ERR190361_2.fastq.gz
;; ERR190382
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190382/ERR190382_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190382/ERR190382_2.fastq.gz
;; ERR190389
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190389/ERR190389_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR190/ERR190389/ERR190389_2.fastq.gz
;; ERR212038
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212038/ERR212038_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212038/ERR212038_2.fastq.gz
;; ERR212054
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212054/ERR212054_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212054/ERR212054_2.fastq.gz
;; ERR212066
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212066/ERR212066_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212066/ERR212066_2.fastq.gz
;; ERR212073
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212073/ERR212073_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212073/ERR212073_2.fastq.gz
;; ERR212103
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212103/ERR212103_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212103/ERR212103_2.fastq.gz
;; ERR212109
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212109/ERR212109_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212109/ERR212109_2.fastq.gz
;; ERR212116
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212116/ERR212116_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212116/ERR212116_2.fastq.gz
;; ERR212155
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212155/ERR212155_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212155/ERR212155_2.fastq.gz
;; ERR212160
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212160/ERR212160_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212160/ERR212160_2.fastq.gz
;; ERR212163
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212163/ERR212163_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212163/ERR212163_2.fastq.gz
;; ERR212164
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212164/ERR212164_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212164/ERR212164_2.fastq.gz
;; ERR212166
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212166/ERR212166_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR212/ERR212166/ERR212166_2.fastq.gz
;; ERR216902
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216902/ERR216902_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216902/ERR216902_2.fastq.gz
;; ERR216904
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216904/ERR216904_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216904/ERR216904_2.fastq.gz
;; ERR216940
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216940/ERR216940_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216940/ERR216940_2.fastq.gz
;; ERR216950
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216950/ERR216950_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216950/ERR216950_2.fastq.gz
;; ERR216952
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216952/ERR216952_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR216/ERR216952/ERR216952_2.fastq.gz
;; ERR221562
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221562/ERR221562_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221562/ERR221562_2.fastq.gz
;; ERR221563
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221563/ERR221563_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221563/ERR221563_2.fastq.gz
;; ERR221567
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221567/ERR221567_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221567/ERR221567_2.fastq.gz
;; ERR221580
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221580/ERR221580_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221580/ERR221580_2.fastq.gz
;; ERR221593
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221593/ERR221593_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221593/ERR221593_2.fastq.gz
;; ERR221596
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221596/ERR221596_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221596/ERR221596_2.fastq.gz
;; ERR221608
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221608/ERR221608_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR221/ERR221608/ERR221608_2.fastq.gz
;; ERR245748
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245748/ERR245748_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245748/ERR245748_2.fastq.gz
;; ERR245817
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245817/ERR245817_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245817/ERR245817_2.fastq.gz
;; ERR245820
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245820/ERR245820_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245820/ERR245820_2.fastq.gz
;; ERR245822
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245822/ERR245822_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245822/ERR245822_2.fastq.gz
;; ERR245825
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245825/ERR245825_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR245/ERR245825/ERR245825_2.fastq.gz
;; ERR983237
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR983/ERR983237/ERR983237_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR983/ERR983237/ERR983237_2.fastq.gz
;; ERR171130
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR171/ERR171130/ERR171130_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR171/ERR171130/ERR171130_2.fastq.gz
;; ERR171131
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR171/ERR171131/ERR171131_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/ERR171/ERR171131/ERR171131_2.fastq.gz
;; SRR5709868
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/008/SRR5709868/SRR5709868_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/008/SRR5709868/SRR5709868_2.fastq.gz
;; SRR5709913
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/003/SRR5709913/SRR5709913_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/003/SRR5709913/SRR5709913_2.fastq.gz
;; SRR5709917
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/007/SRR5709917/SRR5709917_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/007/SRR5709917/SRR5709917_2.fastq.gz
;; SRR5709924
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/004/SRR5709924/SRR5709924_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/004/SRR5709924/SRR5709924_2.fastq.gz
;; SRR5709937
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/007/SRR5709937/SRR5709937_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/007/SRR5709937/SRR5709937_2.fastq.gz
;; SRR5709941
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/001/SRR5709941/SRR5709941_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/001/SRR5709941/SRR5709941_2.fastq.gz
;; SRR5709955
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/005/SRR5709955/SRR5709955_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/005/SRR5709955/SRR5709955_2.fastq.gz
;; SRR5709955
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/005/SRR5709955/SRR5709955_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR570/005/SRR5709955/SRR5709955_2.fastq.gz
;; SRR5710008
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR571/008/SRR5710008/SRR5710008_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR571/008/SRR5710008/SRR5710008_2.fastq.gz
;; SRR5065322
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/002/SRR5065322/SRR5065322_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/002/SRR5065322/SRR5065322_2.fastq.gz
;; SRR5065386
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/006/SRR5065386/SRR5065386_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/006/SRR5065386/SRR5065386_2.fastq.gz
;; SRR5067357
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/007/SRR5067357/SRR5067357_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/007/SRR5067357/SRR5067357_2.fastq.gz
;; SRR5067517
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/007/SRR5067517/SRR5067517_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/007/SRR5067517/SRR5067517_2.fastq.gz
;; SRR5067596
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/006/SRR5067596/SRR5067596_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR506/006/SRR5067596/SRR5067596_2.fastq.gz
;; SRR5073518
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/008/SRR5073518/SRR5073518_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/008/SRR5073518/SRR5073518_2.fastq.gz
;; SRR5073705
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/005/SRR5073705/SRR5073705_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/005/SRR5073705/SRR5073705_2.fastq.gz
;; SRR5073987
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/007/SRR5073987/SRR5073987_1.fastq.gz
;; ftp://ftp.sra.ebi.ac.uk/vol1/fastq/SRR507/007/SRR5073987/SRR5073987_2.fastq.gz]
   )




(def driver (firefox {:path-browser "/Applications/Firefox Developer Edition.app/Contents/MacOS/firefox"}))

;;;;;;;;;

(println  "Now we are on the main website")

(go driver "https://www.ebi.ac.uk/ena")

;(fill driver {:id "local-searchbox"} "ERR036201")
; SRR5065386

(defn extract-r-file-links-for-a-genome [genome-id]

  (clear driver {:id "local-searchbox"} )

  (fill driver {:id "local-searchbox"} genome-id)

  (click-el driver
            (query driver {:fn/has-class "submit"}))

  (wait driver 5)

  (click-el driver (nth (query-all driver {:css "#enaIndexerContents > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)"}) 0))

  (wait driver 3)

  (println genome-id)

  (println
  (get-element-attr driver {:css "td.resultReportsCell:nth-child(30) > div:nth-child(1) > a:nth-child(1)"} :href))

  (println
  (get-element-attr driver {:css "td.resultReportsCell:nth-child(30) > div:nth-child(1) > a:nth-child(3)"} :href)))


;(extract-r-file-links-for-a-genome "SRR5065386")

;(extract-r-file-links-for-a-genome "ERR036201")


(map extract-r-file-links-for-a-genome genomes)



;;;;;;;;;

(println "Now we are on the search result page")

(click-el driver (nth (query-all driver {:css "#enaIndexerContents > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > a:nth-child(1)"}) 0))

;;;;;;;;;

(println "Now we are on the genome page")

;; Link to first file
(get-element-attr driver {:css "td.resultReportsCell:nth-child(30) > div:nth-child(1) > a:nth-child(1)"} :href)

;; Link to second file
(get-element-attr driver {:css "td.resultReportsCell:nth-child(30) > div:nth-child(1) > a:nth-child(3)"} :href)