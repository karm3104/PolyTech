<?php
// クラスを定義したファイルの読込み
require_once ("pencil.php");
?>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta charset="UTF-8" >
	<title>クラスを作って使ってみよう</title>
	<link rel="stylesheet" href="/php/css/skyblue.css">
</head>
<body>
	<div class="bg-success padding-y-20">
		<div class="container text-center">
			<h1>クラスを作って使ってみよう</h1>
		</div>
	</div>
	<div class="container padding-y-20">
		<h2>商品１</h2>
		<?php
		// オブジェクトを作る
		// ここに追加
		// プロパティのデータを表示
		// ここに追加
		?>
		<hr>
		<h2>商品２</h2>
		<?php
		// プロパティにデータを代入
		$item->setData ( "三つ星", "B", 80 );
		// プロパティのデータを表示
		$item->printData ();
		?>
	</div>
</body>
</html>