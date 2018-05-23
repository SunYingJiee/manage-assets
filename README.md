# manage-assets
资产管理

设计思路
1.实体类说明：
AssetsStore用于记录资产类型和库存、价格、批次号（batchNo）等信息；
AssetsType用于说明资产类型；
ColorType用于说明资产颜色；
SizeType用于说明资产大小；
AssetsDetial用于记录每一件资产的信息，如类型、大小、颜色、批次号、状态、分配状态、维修状态等
2.实现
1）根据批次号查找每个批次资产的价格：根据AssetsStore中的批次号（batchNo）可查出该批次号对应的资产，以及资产类型和价格。
2）新购买的资产会在
