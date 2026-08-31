# git push トラブルシューティング

## 現象

git push が失敗する。 エラーメッセージ： > git push origin main:main This repository is configured for Git LFS but 'git-lfs' was not found on your path. If you no longer wish to use Git LFS, remove this hook by deleting the 'pre-push' file in the hooks directory (set by 'core.hookspath'; usually '.git/hooks'). error: failed to push some refs to ' tempest200903/SpringBoot-training'

## 対処方法

rm "$(git rev-parse --git-path hooks/pre-push)"

