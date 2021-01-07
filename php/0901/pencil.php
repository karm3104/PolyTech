<?php
class Pencil {
	// ここに追加

	// コンストラクタ
	public function __construct($maker, $hardness, $price) {
		$this->maker = $maker;
		$this->hardness = $hardness;
		$this->price = $price;
	}

	// プロパティに値を代入するメソッド
	public function setData($maker, $hardness, $price) {
		$this->maker = $maker;
		$this->hardness = $hardness;
		$this->price = $price;
	}

	// プロパティのデータを表示するメソッド
	// ここに追加
}
?>
