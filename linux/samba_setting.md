# Samba環境の構築

## 環境構築

### Sambaのインストール
  sambaをインストールするとsmbclientも一緒にインストールされることが多いが、バージョンなどによりインストールされない場合に備えインストールする。


```
$sudo apt-get install samba smbclient
```

### バージョンの確認

```
$samba --version
```

### 動作確認

```
$systemctl status smbd
```

### 停止

```
$systemctl stop smbd
```

### 停止状態からの起動

```
$systemctl start smbd
```

### 停止状態からの再起動

```
$systemctl restart smbd
```

### 設定ファイルの文法チェック

```
$testparm
```

文法チェックは以下ならOK

    Load smb config files from
    /etc/samba/smb.conf
    Processing section "[homes]"
    Processing section "[printers]"
    Processing section "[print$]"
    Processing section "[追加したディレクトリ]"
    Loaded services file OK.
    Server role: ROLE_STANDALONE
    Press enter to see a dump of your service definitions

## 設定ファイルと各デーモン

### 設定ファイルの場所

```
/etc/samba/smb.conf
```