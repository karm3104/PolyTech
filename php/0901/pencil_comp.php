<?php
class Pencil {
	private $maker; // メーカー
	private $hardness; // 硬度
	private $price; // 価格

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
	public function printData() {
		echo "メーカー：{$this->maker}<br>";
		echo "硬　度　：{$this->hardness}<br>";
		echo "価　格　：{$this->price}<br>";
	}
}
?>
