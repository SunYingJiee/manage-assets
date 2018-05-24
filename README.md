# manage-assets
资产管理

## 设计思路
### 1.实体类说明：
AssetsStore用于记录资产类型和库存、价格、批次号（batchNo）等信息；

AssetsType用于说明资产类型；

ColorType用于说明资产颜色；

SizeType用于说明资产大小；

AssetsDetial用于记录每一件资产的信息，如id、类型、大小、颜色、批次号、状态、分配状态、分配的目的地、维修状态等

### 2.实现
1）根据批次号查找每个批次资产的价格：根据AssetsStore中的批次号（batchNo）可查出该批次号对应的资产，以及资产类型和价格。

2）新购买的资产在AssetsDetail中记录，记录每个资产的信息。其中id自增长，资产状态为初始（INITIAL）状态，分配状态（DistributedStatus）为未分配（UNDISTRIBUTED）状态，可以被分配到某个办公室，分配出去后会在AssetsStore中记录库存（store）和分配出去的数量（distributeNum）

3）进行资产分配时，更新AssetsDetai中的分配状态为DISTRIBUTED，并更新AssetsStore中的库存（store）

4）维修时资产状态（AssetsStatus）为（IN_MAINTENANCE），根据这个状态值可查出哪些资产处于报修状态

5）
