const fraseEl = document.getElementById('frase');
const btn = document.getElementById('btnNovaFrase');

async function carregarFrase() {
    try {
        const res = await fetch('/api/frase');
        if (!res.ok) throw new Error('Erro na requisição');
        const frase = await res.text();
        fraseEl.textContent = frase;
        // Efeito de fade
        fraseEl.style.opacity = '0';
        setTimeout(() => fraseEl.style.opacity = '1', 50);
    } catch (error) {
        fraseEl.textContent = '❌ Não foi possível carregar a frase.';
    }
}

// Carrega ao abrir a página
carregarFrase();

// Botão nova frase
btn.addEventListener('click', carregarFrase);
